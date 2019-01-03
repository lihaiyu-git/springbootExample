package com.springboot.service;

import com.springboot.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
//        SingleService s1 = context.getBean(SingleService.class);
//        SingleService s2 = context.getBean(SingleService.class);
//
//        ProtoTypeService p1 = context.getBean(ProtoTypeService.class);
//        ProtoTypeService p2 = context.getBean(ProtoTypeService.class);
//
//        System.out.println(s1.equals(s2));
//        System.out.println(p1.equals(p2));
//
//        context.close();

        ScheduleService scheduleService = context.getBean(ScheduleService.class);
//        scheduleService.report();
//        scheduleService.report1();
    }
}
