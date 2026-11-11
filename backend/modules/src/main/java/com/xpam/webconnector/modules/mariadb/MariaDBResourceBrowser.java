package com.xpam.webconnector.modules.mariadb;

import com.xpam.webconnector.framework.datasource.ConnectionManager;
import com.xpam.webconnector.modules.mysql.MysqlResourceBrowser;


public class MariaDBResourceBrowser extends MysqlResourceBrowser {

    public MariaDBResourceBrowser(ConnectionManager connectionManager) {
        super(connectionManager);
    }
}
