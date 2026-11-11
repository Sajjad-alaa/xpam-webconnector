package com.xpam.webconnector.framework.datasource;

import com.xpam.webconnector.framework.datasource.entity.resource.*;
import com.xpam.webconnector.framework.datasource.metadata.RelationScope;

import java.sql.SQLException;
import java.util.List;

public interface ResourceBrowser {
    void buildTree() throws SQLException;

    TreeNode getTree() throws SQLException;

    List<TreeNode> getChildren(TreeNode node) throws SQLException;

    List<TreeNode> getChildren(TreeNode node, boolean fromCache) throws SQLException;

    RelationScope resolveScope(ResourceNodeSnapshot node, String context) throws SQLException;

    ResourceNodeSnapshot getIndexedNode(String key);
}
