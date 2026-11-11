package com.xpam.webconnector.framework.i18n;

import com.xpam.webconnector.framework.datasource.sql.SqlValidator;
import com.xpam.webconnector.framework.i18n.MessageUtils;
import com.xpam.webconnector.framework.session.Session;
import com.xpam.webconnector.framework.session.SessionManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserVisibleMessageI18nTest {
    private String sessionToken;
    private final AtomicReference<Locale> locale = new AtomicReference<>(Locale.US);

    @BeforeEach
    void setUp() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        Path bundle = propertiesDir().resolve("messages");
        messageSource.setBasename(bundle.toUri().toString());
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setFallbackToSystemLocale(false);
        new MessageUtils(messageSource);
        Session session = (Session) Proxy.newProxyInstance(
                Session.class.getClassLoader(),
                new Class[]{Session.class},
                (proxy, method, args) -> "getLocale".equals(method.getName()) ? this.locale.get() : null);
        this.sessionToken = SessionManager.registerSession(session);
        SessionManager.setContext(this.sessionToken);
    }

    @AfterEach
    void tearDown() {
        if (this.sessionToken != null) {
            SessionManager.unregisterSession(this.sessionToken);
        }
        SessionManager.setContext(null);
    }

    // XPAM is English only: a session locale that still says zh/ja/ru (old cookie, ?lang=) falls back
    // to the English base bundle, never to a translation.
    @Test
    void userVisibleMessagesAreEnglishForEveryLocale() {
        for (Locale sessionLocale : List.of(Locale.US, Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.of("ru"))) {
            this.locale.set(sessionLocale);
            String name = sessionLocale.toLanguageTag();
            assertEquals("Affected rows", MessageUtils.get("AffectedRows"), name);
            assertEquals("unknown", MessageUtils.get("Unknown"), name);
            assertEquals("Error: boom", MessageUtils.get("ErrorPrefix", "boom"), name);
            assertEquals("3 rows exported", MessageUtils.get("RowsExported", 3), name);
            assertEquals(SqlValidator.QUERY_UNSUPPORTED_MESSAGE, SqlValidator.queryUnsupportedMessage(), name);
        }
    }

    @Test
    void onlyEnglishBundlesShip() throws Exception {
        List<String> bundles = Files.list(propertiesDir())
                .map(path -> path.getFileName().toString())
                .filter(name -> name.startsWith("messages") && name.endsWith(".properties"))
                .sorted()
                .toList();
        assertEquals(List.of("messages.properties", "messages_en.properties"), bundles);
    }

    @Test
    void affectedRowsTicketPrefixDoesNotRewriteSql() {
        String sql = "UPDATE accounts SET balance = balance - 10";
        this.locale.set(Locale.CHINA);
        String unknownRows = formatTicket(sql, null);
        this.locale.set(Locale.US);
        String knownRows = formatTicket(sql, 3);

        assertTrue(unknownRows.startsWith("Affected rows: unknown\n"), unknownRows);
        assertTrue(unknownRows.endsWith("\n" + sql));
        assertTrue(knownRows.startsWith("Affected rows: 3\n"), knownRows);
        assertTrue(knownRows.endsWith("\n" + sql));
        assertEquals(sql, unknownRows.substring(unknownRows.indexOf('\n') + 1));
        assertEquals(sql, knownRows.substring(knownRows.indexOf('\n') + 1));
    }

    @Test
    void propertiesKeySetsStayAligned() throws Exception {
        Path dir = propertiesDir();
        List<Path> files = Files.list(dir)
                .filter(path -> path.getFileName().toString().startsWith("messages")
                        && path.getFileName().toString().endsWith(".properties"))
                .sorted()
                .toList();
        assertFalse(files.isEmpty());
        Set<String> expected = null;
        for (Path file : files) {
            Set<String> keys = Files.readAllLines(file).stream()
                    .filter(line -> !line.isBlank() && !line.startsWith("#") && line.contains("="))
                    .map(line -> line.substring(0, line.indexOf('=')))
                    .collect(Collectors.toCollection(HashSet::new));
            if (expected == null) {
                expected = keys;
            } else {
                assertEquals(expected, keys, file.getFileName().toString());
            }
        }
        assertTrue(expected.contains("AffectedRows"));
        assertTrue(expected.contains("Unknown"));
        assertTrue(expected.contains("QueryUnsupported"));
        assertTrue(expected.contains("RowsExported"));
        assertTrue(expected.contains("ErrorPrefix"));
    }

    private static Path propertiesDir() {
        Path dir = Path.of("../web/src/main/resources/i18n");
        if (!Files.isDirectory(dir)) {
            dir = Path.of("backend/web/src/main/resources/i18n");
        }
        if (!Files.isDirectory(dir)) {
            dir = Path.of("src/main/resources/i18n");
        }
        return dir.toAbsolutePath().normalize();
    }

    private static String formatTicket(String sql, Integer affectedRows) {
        String value = affectedRows == null
                ? MessageUtils.getOrDefault("Unknown", "unknown")
                : Integer.toString(affectedRows);
        return String.format("%s: %s\n%s",
                MessageUtils.getOrDefault("AffectedRows", "Affected rows"),
                value,
                sql);
    }
}
