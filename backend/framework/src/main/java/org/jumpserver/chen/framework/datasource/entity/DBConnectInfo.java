package org.jumpserver.chen.framework.datasource.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Data
public class DBConnectInfo {
    private String dbType;
    private String host;
    private Integer port;
    private String user;
    private String password;
    private String db;
    private String proxyHost;
    private Integer proxyPort;

    private Map<String, Object> options = new HashMap<>();

    // XPAM: the asset address and database name end up inside a JDBC URL. Only plain host names, IP
    // addresses and database identifiers are accepted, so no driver option (allowLoadLocalInfile,
    // autoDeserialize, socketFactory, ";prop=value"...) can be smuggled in through asset fields.
    // XPAM: host labels may contain '_' (e.g. xpam_postgresql), a single trailing dot is accepted and
    // SQL Server "host\INSTANCE" is allowed when the instance is a plain name.
    private static final Pattern HOST = Pattern.compile(
            "^(?:[A-Za-z0-9_](?:[A-Za-z0-9_-]{0,62})(?:\\.[A-Za-z0-9_](?:[A-Za-z0-9_-]{0,62}))*\\.?(?:\\\\[A-Za-z0-9_$#-]{1,128})?"
                    + "|\\[?[0-9A-Fa-f:.]{2,45}]?)$");
    // XPAM: database names are checked with a blacklist of URL/option metacharacters so Unicode names work.
    private static final String DB_FORBIDDEN = ";?&=/:\\\\\"'`";
    private static final int DB_MAX_LENGTH = 128;

    private static String checkedHost(String value) {
        if (value == null || !HOST.matcher(value).matches()) {
            throw new IllegalArgumentException("Invalid database host");
        }
        return value;
    }

    private static String checkedDb(String value) {
        String db = value == null ? "" : value;
        if (db.length() > DB_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid database name");
        }
        for (int i = 0; i < db.length(); i++) {
            char c = db.charAt(i);
            if (DB_FORBIDDEN.indexOf(c) >= 0 || Character.isISOControl(c)
                    || Character.isWhitespace(c) || Character.isSpaceChar(c)) {
                throw new IllegalArgumentException("Invalid database name");
            }
        }
        return db;
    }

    public String toDisplayJDBCUrl(String template) {
        // XPAM: display only, never throw
        String h = this.host == null ? "" : this.host;
        String d = this.db == null ? "" : this.db;
        String p = this.port == null ? "" : this.port.toString();
        return template.replace("${host}", h).replace("${port}", p).replace("${db}", d);
    }

    public String toJDBCUrl(String template) {
        return this.toJDBCUrl(template, this.db);
    }

    public String toJDBCUrl(String template, String db) {
        var host = this.proxyHost == null ? this.host : this.proxyHost;
        var port = this.proxyPort == null ? this.port : this.proxyPort;


        return template.replace("${host}", checkedHost(host))
                .replace("${port}", port.toString())
                .replace("${db}", checkedDb(db));
    }
}
