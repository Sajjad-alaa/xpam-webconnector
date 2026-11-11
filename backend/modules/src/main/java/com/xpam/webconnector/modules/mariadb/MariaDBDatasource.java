package com.xpam.webconnector.modules.mariadb;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;
import com.xpam.webconnector.modules.mysql.MysqlMetadataProvider;
import com.xpam.webconnector.modules.mysql.MysqlActionHandler;

public class MariaDBDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new MariaDBExecutionPlanDialect();

    static {
        DatasourceFactory.Register(MariaDBDatasource.class);
    }

    public MariaDBDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new MariaDBConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new MysqlMetadataProvider(this.connectionManager));
        this.resourceBrowser = new MariaDBResourceBrowser(this.connectionManager);
        this.actionHandler = new MysqlActionHandler();
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }

    @Override
    public String getName() {
        return "mariadb";
    }

    @Override
    public DbType getDruidDbType() {
        return DbType.mysql;
    }
}
