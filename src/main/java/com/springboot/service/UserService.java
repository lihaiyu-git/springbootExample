package com.springboot.service;

import com.springboot.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public Integer count(){
        return  userDao.count();
    }
}
