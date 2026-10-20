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
    private static final Pattern HOST = Pattern.compile(
            "^(?:[A-Za-z0-9](?:[A-Za-z0-9-]{0,62})(?:\\.[A-Za-z0-9](?:[A-Za-z0-9-]{0,62}))*|\\[?[0-9A-Fa-f:.]{2,45}]?)$");
    private static final Pattern DB = Pattern.compile("^[A-Za-z0-9_$.#-]{0,128}$");

    private static String checkedHost(String value) {
        if (value == null || !HOST.matcher(value).matches()) {
            throw new IllegalArgumentException("Invalid database host");
        }
        return value;
    }

    private static String checkedDb(String value) {
        String db = value == null ? "" : value;
        if (!DB.matcher(db).matches()) {
            throw new IllegalArgumentException("Invalid database name");
        }
        return db;
    }

    public String toDisplayJDBCUrl(String template) {
        return template.replace("${host}", checkedHost(this.host))
                .replace("${port}", this.port.toString())
                .replace("${db}", checkedDb(db));
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
