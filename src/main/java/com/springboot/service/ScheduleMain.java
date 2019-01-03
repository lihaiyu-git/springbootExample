package com.springboot.service;

import com.springboot.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        ScheduleService scheduleService = context.getBean(ScheduleService.class);
//        scheduleService.report();
//        scheduleService.report1();
//        context.close();//close后定时器就会失效
    }

}
