package com.xpam.webconnector.framework.console.dataview;

import lombok.Data;
import com.xpam.webconnector.framework.datasource.entity.resource.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
public class DataViewData {
    private boolean editable;
    private List<Map<String, Object>> data = new ArrayList<>();
    private List<Field> fields = new ArrayList<>();
}
