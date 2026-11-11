package com.xpam.webconnector.modules.clickhouse;

import com.xpam.webconnector.framework.datasource.ConnectionManager;
import com.xpam.webconnector.framework.datasource.base.BaseResourceBrowser;

public class ClickhouseResourceBrowser extends BaseResourceBrowser {
    public ClickhouseResourceBrowser(ConnectionManager connectionManager) {
        super(connectionManager);
    }
}
