package com.xpam.webconnector.framework.datasource.plan;

public enum PlanTransactionState {
    AUTO_COMMIT,
    MANUAL_COMMIT_IDLE,
    TRANSACTION_ACTIVE,
    TRANSACTION_FAILED,
    UNKNOWN
}
