package com.xpam.webconnector.framework.jms.impl;

import lombok.extern.slf4j.Slf4j;
import com.xpam.webconnector.framework.jms.CommandHandler;
import com.xpam.webconnector.framework.jms.entity.CommandRecord;
import com.xpam.grpc.proto.Common;
import com.xpam.grpc.proto.ServiceGrpc;
import com.xpam.grpc.proto.ServiceOuterClass;

import java.util.concurrent.TimeUnit;

@Slf4j
public class CommandHandlerImpl implements CommandHandler {
    private static final long COMMAND_UPLOAD_TIMEOUT_SECONDS = 30;
    private final Common.Session session;
    private final ServiceGrpc.ServiceBlockingStub serviceBlockingStub;


    public CommandHandlerImpl(Common.Session session, ServiceGrpc.ServiceBlockingStub serviceBlockingStub) {
        this.session = session;
        this.serviceBlockingStub = serviceBlockingStub;
    }

    @Override
    public void recordCommand(CommandRecord commandRecord) {

        var reqBuilder = ServiceOuterClass.CommandRequest
                .newBuilder()
                .setSid(this.session.getId())
                .setOrgId(this.session.getOrgId())
                .setAsset(this.session.getAsset())
                .setAccount(this.session.getAccount())
                .setUser(this.session.getUser())
                .setTimestamp(System.currentTimeMillis() / 1000)
                .setInput(commandRecord.getInput())
                .setOutput(commandRecord.getOutput())
                .setRiskLevel(commandRecord.getRiskLevel() != null
                        ? commandRecord.getRiskLevel()
                        : Common.RiskLevel.Normal);

        if (commandRecord.getCmdAclId() != null && !commandRecord.getCmdAclId().isBlank()) {
            reqBuilder.setCmdAclId(commandRecord.getCmdAclId());
        }
        if (commandRecord.getCmdGroupId() != null && !commandRecord.getCmdGroupId().isBlank()) {
            reqBuilder.setCmdGroupId(commandRecord.getCmdGroupId());
        }

        log.info(
                "upload command sessionId={} command={} riskLevel={} cmdAclId={} cmdGroupId={}",
                this.session.getId(),
                commandRecord.getInput(),
                commandRecord.getRiskLevel(),
                commandRecord.getCmdAclId(),
                commandRecord.getCmdGroupId()
        );

        var resp = this.serviceBlockingStub
                .withDeadlineAfter(COMMAND_UPLOAD_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .uploadCommand(reqBuilder.build());
        if (!resp.getStatus().getOk()) {
            throw new RuntimeException("upload command failed: " + resp.getStatus().getErr());
        }
    }



}
