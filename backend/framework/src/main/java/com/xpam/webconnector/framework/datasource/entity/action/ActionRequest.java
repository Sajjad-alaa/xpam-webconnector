package com.xpam.webconnector.framework.datasource.entity.action;

import lombok.Data;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;

@Data
public class ActionRequest {
    private String action;
    private TreeNode node;
}
