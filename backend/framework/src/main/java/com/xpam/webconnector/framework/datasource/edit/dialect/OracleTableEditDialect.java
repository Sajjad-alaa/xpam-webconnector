package com.xpam.webconnector.framework.datasource.edit.dialect;

import com.alibaba.druid.DbType;

class OracleTableEditDialect extends AbstractTableEditDialect {
    OracleTableEditDialect() {
        super(DbType.oracle);
    }
}
