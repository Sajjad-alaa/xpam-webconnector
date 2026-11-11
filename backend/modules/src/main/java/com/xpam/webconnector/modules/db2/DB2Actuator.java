package com.xpam.webconnector.modules.db2;

import com.xpam.webconnector.framework.datasource.ConnectionManager;
import com.xpam.webconnector.framework.datasource.base.BaseSQLActuator;
import com.xpam.webconnector.framework.datasource.sql.SQL;
import com.xpam.webconnector.framework.datasource.sql.SQLExecutePlan;
import com.xpam.webconnector.framework.datasource.sql.SQLIdentifier;
import com.xpam.webconnector.framework.datasource.sql.SQLQueryParams;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DB2Actuator extends BaseSQLActuator {
    public DB2Actuator(ConnectionManager connectionManager) {
        super(connectionManager);
    }

    public DB2Actuator(DB2Actuator sqlActuator, Connection connection) {
        super(sqlActuator, connection);
    }

    @Override
    public String getCurrentSchema() throws SQLException {
        var result = this.execute(SQL.of("select current schema from sysibm.dual"));
        return (String) result.getData().get(0).get(0);
    }

    @Override
    public List<String> getSchemas() throws SQLException {
        var result = this.execute(SQL.of("select SCHEMANAME from syscat.schemata"));
        return result.getData().stream().map(row -> (String) row.get(0)).toList();
    }

    @Override
    public void changeSchema(String schema) throws SQLException {
        var identifier = SQLIdentifier.quote(this.getDbType(), schema);
        this.execute(SQL.of("set current schema " + identifier));
    }


    @Override
    public SQLExecutePlan createPlan(String schema, String table, SQLQueryParams sqlQueryParams) throws SQLException {
        var schemaIdentifier = SQLIdentifier.quote(this.getDbType(), schema);
        var tableIdentifier = SQLIdentifier.quote(this.getDbType(), table);
        var sql = SQL.of("select * from " + schemaIdentifier + "." + tableIdentifier);
        return this.createPlan(sql, sqlQueryParams);
    }
}
