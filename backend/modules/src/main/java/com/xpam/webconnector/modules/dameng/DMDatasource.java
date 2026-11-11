package com.xpam.webconnector.modules.dameng;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class DMDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new DmExecutionPlanDialect();

    static {
        DatasourceFactory.Register(DMDatasource.class);
    }

    public DMDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new DMConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new DmMetadataProvider(this.connectionManager));
        this.resourceBrowser = new DMResourceBrowser(this.connectionManager);
        this.actionHandler = new DMActionHandler();
    }

    @Override
    public String getName() {
        return "dameng";
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.dm;
    }
}
