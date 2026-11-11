package com.xpam.webconnector.framework.console.entity.request;


import lombok.Data;

@Data
public class Query {
    private String sql;
    private String schema;
    private int offset;
    private int limit;
    private String resultId;
}
