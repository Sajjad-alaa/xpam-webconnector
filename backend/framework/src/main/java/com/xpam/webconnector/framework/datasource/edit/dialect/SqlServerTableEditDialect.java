package com.xpam.webconnector.framework.datasource.edit.dialect;

import com.alibaba.druid.DbType;

class SqlServerTableEditDialect extends AbstractTableEditDialect {
    SqlServerTableEditDialect() {
        super(DbType.sqlserver);
    }
}
