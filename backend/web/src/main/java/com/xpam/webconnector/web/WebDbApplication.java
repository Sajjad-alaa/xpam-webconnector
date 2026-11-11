package com.xpam.webconnector.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages = {"com.xpam.webconnector"})
public class WebDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDbApplication.class, args);
    }

}
