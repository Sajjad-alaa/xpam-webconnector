package com.xpam.webconnector.framework.datasource.entity.resource;

import lombok.Data;
import com.xpam.webconnector.framework.utils.TreeUtils;

@Data
public class Root implements ResourceNode {
    private String name;
    @Override
    public TreeNode toResourceNode(TreeNode parent) {
        TreeNode treeNode = new TreeNode();
        treeNode.setType("datasource");
        treeNode.setLabel(this.name);
        treeNode.setKey(TreeUtils.generateNodeKey(parent, treeNode.getType(), "root"));
        return treeNode;
    }
}
