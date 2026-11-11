package com.xpam.webconnector.framework.datasource.edit.exception;

import java.sql.SQLException;

public class TableEditException extends SQLException {
    public TableEditException(String reason) {
        super(reason);
    }

    public TableEditException(String reason, Throwable cause) {
        super(reason, cause);
    }
}
