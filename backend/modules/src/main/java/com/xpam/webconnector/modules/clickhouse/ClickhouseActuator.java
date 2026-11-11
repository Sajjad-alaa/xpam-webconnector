package com.xpam.webconnector.modules.clickhouse;

import com.xpam.webconnector.framework.datasource.ConnectionManager;
import com.xpam.webconnector.framework.datasource.base.BaseSQLActuator;
import com.xpam.webconnector.framework.datasource.sql.SQL;
import com.xpam.webconnector.framework.datasource.sql.SQLExecutePlan;
import com.xpam.webconnector.framework.datasource.sql.SQLIdentifier;
import com.xpam.webconnector.framework.datasource.sql.SQLQueryParams;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClickhouseActuator extends BaseSQLActuator {
    public ClickhouseActuator(ConnectionManager connectionManager) {
        super(connectionManager);
    }

    public ClickhouseActuator(ClickhouseActuator sqlActuator, Connection connection) {
        super(sqlActuator, connection);
    }

    @Override
    public String getCurrentSchema() throws SQLException {
        var result = this.execute(SQL.of("select database()"));
        return (String) result.getData().get(0).get(0);
    }

    @Override
    public List<String> getSchemas() throws SQLException {
        var result = this.execute(SQL.of("show databases"));
        return result.getData().stream().map(row -> (String) row.get(0)).toList();
    }

    @Override
    public void changeSchema(String schema) throws SQLException {
        var identifier = SQLIdentifier.quote(this.getDbType(), schema);
        this.execute(SQL.of("use " + identifier));
    }


    @Override
    public SQLExecutePlan createPlan(String schema, String table, SQLQueryParams sqlQueryParams) throws SQLException {
        var sql = SQL.of("select * from `?`.`?`", schema, table);
        return this.createPlan(sql, sqlQueryParams);
    }
}
