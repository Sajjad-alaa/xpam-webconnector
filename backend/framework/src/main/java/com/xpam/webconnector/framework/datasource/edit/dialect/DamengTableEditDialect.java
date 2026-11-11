package com.xpam.webconnector.framework.datasource.edit.dialect;

import com.alibaba.druid.DbType;

class DamengTableEditDialect extends AbstractTableEditDialect {
    DamengTableEditDialect() {
        super(DbType.dm);
    }
}
