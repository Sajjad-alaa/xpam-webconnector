package com.xpam.webconnector.modules.mysql;

import com.xpam.webconnector.framework.datasource.ConnectionManager;
import com.xpam.webconnector.framework.datasource.base.BaseResourceBrowser;

public class MysqlResourceBrowser extends BaseResourceBrowser {
    public MysqlResourceBrowser(ConnectionManager connectionManager) {
        super(connectionManager);
    }
}
