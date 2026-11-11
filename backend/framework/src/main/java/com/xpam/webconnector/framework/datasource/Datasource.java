package com.xpam.webconnector.framework.datasource;


import com.alibaba.druid.DbType;
import com.xpam.webconnector.framework.datasource.entity.DBConnectInfo;
import com.xpam.webconnector.framework.datasource.entity.DatasourceInfo;
import com.xpam.webconnector.framework.datasource.entity.action.EventEmitter;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;
import com.xpam.webconnector.framework.datasource.entity.action.Action;
import com.xpam.webconnector.framework.datasource.entity.form.FormData;
import com.xpam.webconnector.framework.datasource.metadata.MetadataCatalog;
import com.xpam.webconnector.framework.datasource.plan.ExecutionPlanDialect;
import com.xpam.webconnector.framework.datasource.plan.PlanDatabase;
import com.xpam.webconnector.framework.datasource.plan.UnsupportedExecutionPlanDialect;


import java.sql.SQLException;
import java.util.List;

public interface Datasource {
    String getName();
    DbType getDruidDbType();

    void ping();

    void init();

    DatasourceInfo getInfo() ;

    List<TreeNode> getChildren(TreeNode node, boolean fromCache) throws SQLException;

    List<Action> getActions(TreeNode node);

    EventEmitter doAction(TreeNode node, String action) throws SQLException;

    EventEmitter handleForm(FormData formData) throws SQLException;

    DBConnectInfo getConnectInfo();

    ConnectionManager getConnectionManager();
    ResourceBrowser getResourceBrowser();
    MetadataCatalog getMetadataCatalog();

    default ExecutionPlanDialect getExecutionPlanDialect() {
        return UnsupportedExecutionPlanDialect.getInstance();
    }

    /**
     * The actual database product, independent of the Druid SQL dialect returned by
     * {@link #getDruidDbType()}. A datasource may intentionally reuse another product's
     * parser dialect (for example MariaDB uses Druid's MySQL dialect) while still requiring
     * product-specific runtime behavior.
     */
    default PlanDatabase getDatabaseType() {
        ExecutionPlanDialect dialect = this.getExecutionPlanDialect();
        return dialect == null ? null : dialect.database();
    }

    void close();
}
