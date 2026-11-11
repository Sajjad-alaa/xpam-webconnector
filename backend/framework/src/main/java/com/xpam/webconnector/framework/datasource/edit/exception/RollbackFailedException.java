package com.xpam.webconnector.framework.datasource.edit.exception;

import com.xpam.webconnector.framework.datasource.edit.TableChangesSaveService;

import java.sql.SQLException;

public class RollbackFailedException extends TableEditException {
    public RollbackFailedException(SQLException cause, Throwable primaryException) {
        super(TableChangesSaveService.SAVE_CHANGES_ROLLBACK_FAILED, cause);
        this.addSuppressed(primaryException);
    }
}
