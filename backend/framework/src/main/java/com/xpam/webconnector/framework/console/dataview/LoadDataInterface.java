package com.xpam.webconnector.framework.console.dataview;

import com.xpam.webconnector.framework.datasource.sql.SQLQueryParams;
import com.xpam.webconnector.framework.datasource.sql.SQLQueryResult;

import java.sql.SQLException;

@FunctionalInterface
public interface LoadDataInterface {
    SQLQueryResult loadData(SQLQueryParams params) throws SQLException;
}
