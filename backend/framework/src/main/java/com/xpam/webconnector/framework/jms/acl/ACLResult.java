package com.xpam.webconnector.framework.jms.acl;

import lombok.Data;
import com.xpam.grpc.proto.Common;

@Data
public class ACLResult {
    private Common.RiskLevel riskLevel;

    private String CmdAclId;

    private String CmdGroupId;

    private boolean Notify = false;

    private String message;
}
