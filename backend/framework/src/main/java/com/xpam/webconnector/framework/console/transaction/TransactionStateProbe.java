package com.xpam.webconnector.framework.console.transaction;

import java.sql.Connection;

@FunctionalInterface
interface TransactionStateProbe {
    QueryTransactionState inspect(Connection connection);
}
