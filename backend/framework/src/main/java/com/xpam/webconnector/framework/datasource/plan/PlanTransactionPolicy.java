package com.xpam.webconnector.framework.datasource.plan;

public enum PlanTransactionPolicy {
    STATEMENT_ONLY,
    SAVEPOINT_IF_ACTIVE,
    AUXILIARY_DML,
    RESTORE_SESSION
}
