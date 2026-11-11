package com.xpam.webconnector.framework.datasource.entity.form;


import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Option {
    private String label;
    private Object value;
}
