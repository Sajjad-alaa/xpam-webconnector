package com.xpam.webconnector.modules.db2;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class DB2Datasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new Db2ExecutionPlanDialect();

    static {
        DatasourceFactory.Register(DB2Datasource.class);
    }

    public DB2Datasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new DB2ConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new DB2MetadataProvider(this.connectionManager));
        this.resourceBrowser = new DB2ResourceBrowser(this.connectionManager);
        this.actionHandler = new DB2ActionHandler();
    }

    @Override
    public String getName() {
        return "db2";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.db2;
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }
}
