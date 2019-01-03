package com.springboot.service;

import com.springboot.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        AwareService xx = context.getBean(AwareService.class);
        xx.outPutResult();
        context.close();

    }
}
