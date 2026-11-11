package com.xpam.webconnector.modules.mysql;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class MysqlDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new MysqlExecutionPlanDialect();

    static {
        DatasourceFactory.Register(MysqlDatasource.class);
    }

    public MysqlDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new MysqlConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new MysqlMetadataProvider(this.connectionManager));
        this.resourceBrowser = new MysqlResourceBrowser(this.connectionManager);
        this.actionHandler = new MysqlActionHandler();
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }

    @Override
    public String getName() {
        return "mysql";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.mysql;
    }
}
