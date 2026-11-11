package com.xpam.webconnector.framework.datasource.edit.exception;

import com.xpam.webconnector.framework.datasource.edit.TableChangesSaveService;

import java.sql.SQLException;

public class RolledBackConnectionUnavailableException extends TableEditException {
    public RolledBackConnectionUnavailableException(SQLException cause, Throwable primaryException) {
        super(TableChangesSaveService.SAVE_CHANGES_ROLLED_BACK_CONNECTION_UNAVAILABLE, cause);
        this.addSuppressed(primaryException);
    }
}
