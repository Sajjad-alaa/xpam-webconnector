package com.xpam.webconnector.framework.datasource.edit.dialect;

import com.alibaba.druid.DbType;

class PostgresqlTableEditDialect extends AbstractTableEditDialect {
    PostgresqlTableEditDialect() {
        super(DbType.postgresql);
    }
}
