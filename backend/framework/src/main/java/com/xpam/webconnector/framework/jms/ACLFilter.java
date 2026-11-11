package com.xpam.webconnector.framework.jms;

import com.xpam.webconnector.framework.jms.acl.ACLCommandContext;
import com.xpam.webconnector.framework.jms.acl.ACLResult;

import java.sql.Connection;

public interface ACLFilter {
    default ACLResult commandACLFilter(String command, Connection connection) {
        ACLCommandContext context = connection == null
                ? ACLCommandContext.executionOwned(null)
                : ACLCommandContext.queryConsoleOwned(connection);
        return this.commandACLFilterWithContext(command, context);
    }

    ACLResult commandACLFilterWithContext(String command, ACLCommandContext context);
}
