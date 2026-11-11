package com.xpam.webconnector.framework.datasource;

import lombok.extern.slf4j.Slf4j;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Slf4j
public class DatasourceFactory {

    private static final Map<String, Class<? extends Datasource>> DATASOURCE_MAP = new ConcurrentHashMap<>();
    private static final Map<String, String> DATASOURCE_CLASS_NAMES = new HashMap<>();

    static {
        DATASOURCE_CLASS_NAMES.put("clickhouse", "com.xpam.webconnector.modules.clickhouse.ClickHouseDatasource");
        DATASOURCE_CLASS_NAMES.put("postgresql", "com.xpam.webconnector.modules.postgresql.PostgresqlDatasource");
        DATASOURCE_CLASS_NAMES.put("mariadb", "com.xpam.webconnector.modules.mariadb.MariaDBDatasource");
        DATASOURCE_CLASS_NAMES.put("oracle", "com.xpam.webconnector.modules.oracle.OracleDatasource");
        DATASOURCE_CLASS_NAMES.put("dameng", "com.xpam.webconnector.modules.dameng.DMDatasource");
        DATASOURCE_CLASS_NAMES.put("mysql", "com.xpam.webconnector.modules.mysql.MysqlDatasource");
        DATASOURCE_CLASS_NAMES.put("sqlserver", "com.xpam.webconnector.modules.sqlserver.SQLServerDatasource");
        DATASOURCE_CLASS_NAMES.put("db2", "com.xpam.webconnector.modules.db2.DB2Datasource");
    }

    public static Datasource fromConnectInfo(DBConnectInfo info) {
        var dbType = info.getDbType();
        var datasource = DATASOURCE_MAP.get(dbType);
        if (datasource == null) {
            lazyRegister(dbType);
            datasource = DATASOURCE_MAP.get(dbType);
        }
        if (datasource == null) {
            throw new RuntimeException("Unsupported dbType: " + dbType);
        }
        try {
            return datasource.getConstructor(DBConnectInfo.class).newInstance(info);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void Register(Class<? extends Datasource> datasource) {
        var dbType = datasource.getPackage().getName().split("\\.")[4];
        log.info("Register datasource for dbType: {}", datasource.getName());
        DATASOURCE_MAP.put(dbType, datasource);
    }

    @SuppressWarnings("unchecked")
    private static void lazyRegister(String dbType) {
        var className = DATASOURCE_CLASS_NAMES.get(dbType);
        if (className == null) {
            return;
        }
        try {
            var datasourceClass = (Class<? extends Datasource>) Class.forName(className);
            Register(datasourceClass);
        } catch (ClassNotFoundException e) {
            log.warn("Datasource class not found for dbType {}: {}", dbType, className);
        }
    }
}
