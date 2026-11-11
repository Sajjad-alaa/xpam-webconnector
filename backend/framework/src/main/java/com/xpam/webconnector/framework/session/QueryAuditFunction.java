package com.xpam.webconnector.framework.session;


import com.xpam.webconnector.framework.datasource.sql.SQLQueryResult;

import java.sql.SQLException;

@FunctionalInterface
public interface QueryAuditFunction {
    SQLQueryResult run() throws SQLException;

}
