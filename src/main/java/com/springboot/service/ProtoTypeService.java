package com.springboot.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ProtoTypeService {
    public String test(){
        return  "prototype";
    }
}
