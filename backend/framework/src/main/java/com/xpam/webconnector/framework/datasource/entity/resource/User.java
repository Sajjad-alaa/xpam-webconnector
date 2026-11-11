package com.xpam.webconnector.framework.datasource.entity.resource;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String id;
    private String name;

}

