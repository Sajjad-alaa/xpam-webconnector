package com.xpam.webconnector.modules.clickhouse;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class ClickHouseDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new ClickHouseExecutionPlanDialect();

    static {
        DatasourceFactory.Register(ClickHouseDatasource.class);
    }

    public ClickHouseDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new ClickhouseConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new ClickhouseMetadataProvider(this.connectionManager));
        this.resourceBrowser = new ClickhouseResourceBrowser(this.connectionManager);
        this.actionHandler = new ClickhouseActionHandler();
    }

    @Override
    public String getName() {
        return "clickhouse";
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }

    @Override
    public DbType getDruidDbType() {
        return DbType.clickhouse;
    }
}
