package com.xpam.webconnector.modules.sqlserver;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class SQLServerDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new SqlServerExecutionPlanDialect();

    static {
        DatasourceFactory.Register(SQLServerDatasource.class);
    }

    public SQLServerDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new SQLServerConnectionManager(dbConnectInfo,this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new SQLServerMetadataProvider(this.connectionManager));
        this.resourceBrowser = new SQLServerResourceBrowser(this.connectionManager);
        this.actionHandler = new SQLServerActionHandler();
    }

    @Override
    public String getName() {
        return "sqlserver";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.sqlserver;
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }

}
