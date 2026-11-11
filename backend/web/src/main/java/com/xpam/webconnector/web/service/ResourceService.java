package com.xpam.webconnector.web.service;

import com.xpam.webconnector.framework.datasource.entity.action.EventEmitter;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;
import com.xpam.webconnector.framework.datasource.entity.action.Action;
import com.xpam.webconnector.framework.datasource.entity.form.FormData;
import com.xpam.webconnector.framework.i18n.MessageUtils;
import com.xpam.webconnector.framework.session.SessionManager;
import com.xpam.webconnector.framework.datasource.metadata.ObjectRef;
import com.xpam.webconnector.framework.datasource.metadata.RelationKind;
import com.xpam.webconnector.framework.utils.TreeUtils;
import com.xpam.webconnector.web.exception.WebConnectorException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;


@Service
public class ResourceService {

    public List<TreeNode> getChildren(TreeNode node, boolean force) {
        try {
            var ds = SessionManager.getCurrentSession().getDatasource();
            if (!force || node == null) {
                return ds.getChildren(node, !force);
            }
            var browser = ds.getResourceBrowser();
            var resolvedNode = TreeUtils.getNode(browser.getTree(), node.getKey());
            if (resolvedNode == null || !Objects.equals(resolvedNode.getType(), node.getType())) {
                throw new WebConnectorException(MessageUtils.getOrDefault("InvalidResourceNode", "Invalid resource node"));
            }
            this.invalidateMetadata(ds, resolvedNode);
            return ds.getChildren(resolvedNode, false);
        } catch (SQLException e) {
            throw new WebConnectorException(MessageUtils.getOrDefault(
                    "GetChildrenFailed", "Failed to load children of %s", node.getLabel()), e);
        }
    }

    private void invalidateMetadata(com.xpam.webconnector.framework.datasource.Datasource datasource, TreeNode node)
            throws SQLException {
        var browser = datasource.getResourceBrowser();
        var catalog = datasource.getMetadataCatalog();
        var snapshot = browser.getIndexedNode(node.getKey());
        switch (node.getType()) {
            case "datasource" -> catalog.invalidateAll();
            case "database" -> catalog.invalidateCatalog(snapshot.database());
            case "schema", "folder" -> catalog.invalidate(browser.resolveScope(snapshot, null));
            case "table", "view" -> {
                var scope = browser.resolveScope(snapshot, null);
                var kind = "view".equals(node.getType()) ? RelationKind.VIEW : RelationKind.TABLE;
                catalog.invalidate(new ObjectRef(scope.catalog(), scope.schema(), snapshot.table(), kind));
            }
            default -> {
            }
        }
    }

    public List<Action> getActions(TreeNode node) {
        var ds = SessionManager.getCurrentSession().getDatasource();
        return ds.getActions(node);
    }

    public EventEmitter doAction(TreeNode node, String action) {
        try {
            var ds = SessionManager.getCurrentSession().getDatasource();
            var resolvedNode = this.resolveActionNode(ds, node, action);
            return ds.doAction(resolvedNode, action);
        } catch (Exception e) {
            if (e instanceof WebConnectorException) {
                throw (WebConnectorException) e;
            }
            throw new WebConnectorException(MessageUtils.getOrDefault(
                    "ExecuteNodeActionFailed", "Failed to execute action on %s", node.getLabel()), e);
        }
    }

    private TreeNode resolveActionNode(com.xpam.webconnector.framework.datasource.Datasource datasource,
                                       TreeNode requestedNode, String action) throws SQLException {
        if (requestedNode == null || requestedNode.getKey() == null || requestedNode.getKey().isBlank()
                || action == null || action.isBlank()) {
            throw new WebConnectorException(MessageUtils.getOrDefault("InvalidResourceAction", "Invalid resource action"));
        }

        var root = datasource.getResourceBrowser().getTree();
        var resolvedNode = root == null ? null : TreeUtils.getNode(root, requestedNode.getKey());
        if (resolvedNode == null || !Objects.equals(resolvedNode.getType(), requestedNode.getType())) {
            throw new WebConnectorException(MessageUtils.getOrDefault("InvalidResourceNode", "Invalid resource node"));
        }

        var exposed = datasource.getActions(resolvedNode).stream()
                .anyMatch(candidate -> Objects.equals(candidate.getKey(), action));
        if (!exposed) {
            throw new WebConnectorException(MessageUtils.getOrDefault("InvalidResourceAction", "Invalid resource action"));
        }
        return resolvedNode;
    }

    public EventEmitter submitResourceForm(FormData form) throws SQLException {
        var ds = SessionManager.getCurrentSession().getDatasource();
        return ds.handleForm(form);
    }
}
