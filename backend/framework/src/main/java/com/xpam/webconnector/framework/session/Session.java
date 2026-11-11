package com.xpam.webconnector.framework.session;

import com.xpam.webconnector.framework.console.Console;
import com.xpam.webconnector.framework.datasource.Datasource;
import com.xpam.webconnector.framework.datasource.sql.SQLQueryResult;
import com.xpam.webconnector.framework.jms.acl.ACLCommandContext;
import com.xpam.webconnector.framework.jms.acl.ACLResult;
import com.xpam.webconnector.framework.jms.entity.CommandRecord;
import com.xpam.webconnector.framework.jms.exception.CommandRejectException;
import com.xpam.webconnector.framework.session.controller.Controller;
import com.xpam.webconnector.framework.ws.io.PacketIO;
import com.xpam.grpc.proto.Common;

import java.io.File;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface Session {

    String getLockCreator();

    boolean isLocked();

    List<Common.DataMaskingRule> getDataMaskingRules();

    void refreshLastActiveTime();

    LocalDateTime getLastActiveTime();

    boolean canUpload();

    boolean canDownload();

    boolean canCopy();

    boolean canPaste();

    Path getTempPath();

    File createFile(String fileName);

    Controller getController();

    void setGatewayId(String gatewayId);

    void setRemoteAddr(String remoteAddr);

    String getRemoteAddr();

    Locale getLocale();

    void setLocale(Locale locale);

    String getDatasourceName();

    PacketIO getPacketIO();

    Datasource getDatasource();

    Map<String, Console> getConsoles();

    String getWebToken();

    void setWebToken(String webToken);

    String getUsername();

    void setAttribute(String key, Object value);

    void removeAttribute(String key);

    Object getAttribute(String key);

    void activeSession(PacketIO packetIO);

    boolean isActive();

    boolean isClosing();

    void close();

    void close(String message, Object... args);

    // 在有审计的情况下执行命令
    SQLQueryResult withAudit(String command, QueryAuditFunction queryAuditFunction) throws SQLException, CommandRejectException;

    default SQLQueryResult withAudit(String command, ACLResult aclResult, QueryAuditFunction queryAuditFunction)
            throws SQLException, CommandRejectException {
        return withAudit(command, queryAuditFunction);
    }

    List<Map<String, Object>> withMetadataQueryAudit(
            String command,
            MetadataQueryAuditFunction queryAuditFunction
    ) throws SQLException;

    void recordCommand(String command);

    void recordCommand(CommandRecord commandRecord);

    ACLResult checkACL(String command);

    ACLResult checkACL(String command, Connection connection);

    default ACLResult checkACLWithContext(String command, ACLCommandContext context) {
        return this.checkACL(command, context.connection());
    }

    boolean enableAutoComplete();

    void setEnableAutoComplete(boolean enableAutoComplete);
}
