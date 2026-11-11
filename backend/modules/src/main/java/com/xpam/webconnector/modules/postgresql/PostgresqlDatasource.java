package com.xpam.webconnector.modules.postgresql;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class PostgresqlDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new PostgresqlExecutionPlanDialect();

    static {
        DatasourceFactory.Register(PostgresqlDatasource.class);
    }

    public PostgresqlDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new PostgresqlConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new PostgresqlMetadataProvider(this.connectionManager));
        this.resourceBrowser = new PostgresqlResourceBrowser(this.connectionManager);
        this.actionHandler = new PostgresqlActionHandler();
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }

    @Override
    public String getName() {
        return "postgresql";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.postgresql;
    }
}
