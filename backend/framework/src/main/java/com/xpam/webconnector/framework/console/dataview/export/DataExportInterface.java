package com.xpam.webconnector.framework.console.dataview.export;

import com.xpam.webconnector.framework.console.dataview.DataViewData;

public interface DataExportInterface {
    void exportData(String path, DataViewData data) throws Exception;
}