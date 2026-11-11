package com.xpam.webconnector.modules.postgresql.entity;

import lombok.Data;
import com.xpam.webconnector.framework.datasource.entity.resource.ResourceNode;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;
import com.xpam.webconnector.framework.utils.TreeUtils;

@Data
public class Database implements ResourceNode {
    private String name;
    @Override
    public TreeNode toResourceNode(TreeNode parent) {
        TreeNode treeNode = new TreeNode();
        treeNode.setType("database");
        treeNode.setLabel(this.name);
        treeNode.setKey(TreeUtils.generateNodeKey(parent, treeNode.getType(), name));
        return treeNode;
    }
}
