package com.xpam.webconnector.framework.console;

final class QueryConsoleConnectionUnavailableException extends RuntimeException {
    QueryConsoleConnectionUnavailableException(Throwable cause) {
        super("Query console connection is unavailable", cause);
    }
}
