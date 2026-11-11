package com.xpam.webconnector.framework.datasource.edit.exception;

import com.xpam.webconnector.framework.datasource.edit.TableChangesSaveService;

import java.sql.SQLException;

public class SavepointRollbackFailedException extends TableEditException {
    public SavepointRollbackFailedException(SQLException cause, Throwable primaryException) {
        super(TableChangesSaveService.SAVE_CHANGES_SAVEPOINT_ROLLBACK_FAILED, cause);
        this.addSuppressed(primaryException);
    }
}
