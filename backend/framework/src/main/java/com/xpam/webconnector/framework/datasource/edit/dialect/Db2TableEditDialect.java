package com.xpam.webconnector.framework.datasource.edit.dialect;

import com.alibaba.druid.DbType;

class Db2TableEditDialect extends AbstractTableEditDialect {
    Db2TableEditDialect() {
        super(DbType.db2);
    }
}
