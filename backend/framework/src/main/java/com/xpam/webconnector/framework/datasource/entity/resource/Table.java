package com.xpam.webconnector.framework.datasource.entity.resource;

import lombok.Data;
import com.xpam.webconnector.framework.datasource.metadata.RelationKind;
import com.xpam.webconnector.framework.utils.TreeUtils;

@Data
public class Table implements ResourceNode {
    protected String name;
    private String schema;


    @Override
    public TreeNode toResourceNode(TreeNode parent) {
        TreeNode treeNode = new TreeNode();
        treeNode.setLabel(this.name);
        treeNode.setType("table");
        treeNode.setRelationKind(RelationKind.TABLE.code());
        treeNode.setKey(TreeUtils.generateNodeKey(parent, treeNode.getType(), name));
        treeNode.setHasChildren(false);
        return treeNode;
    }
}
