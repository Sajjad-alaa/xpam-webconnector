package com.xpam.webconnector.web.entity;


import lombok.Data;

@Data
public class GetHintsRequest {
    private String nodeKey;
    private String context;
}
