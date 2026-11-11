package com.xpam.webconnector.modules.oracle;

import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.DatasourceFactory;
import com.xpam.webconnector.framework.datasource.base.BaseDatasource;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;

public class OracleDatasource extends BaseDatasource {
    private final ExecutionPlanDialect executionPlanDialect = new OracleExecutionPlanDialect();

    static {
        DatasourceFactory.Register(OracleDatasource.class);
    }

    public OracleDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new OracleConnectionManager(dbConnectInfo, this);
        this.metadataCatalog = new MetadataCatalog(this.connectionManager, new OracleMetadataProvider(this.connectionManager));
        this.resourceBrowser = new OracleResourceBrowser(this.connectionManager);
        this.actionHandler = new OracleActionHandler();
    }

    @Override
    public String getName() {
        return "oracle";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.oracle;
    }

    @Override
    public ExecutionPlanDialect getExecutionPlanDialect() {
        return this.executionPlanDialect;
    }
}
