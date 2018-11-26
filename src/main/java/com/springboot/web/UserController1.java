package com.springboot.web;

import com.springboot.dao.UserDao;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")     // 通过这里配置使下面的映射都在/users下
public class UserController1 {

    @Autowired
    UserDao userDao;

    @GetMapping("/insert/{name}/{age}")
    //@Transactional
    public int insertUser(@PathVariable("name") String name,@PathVariable("age") Integer age){
        userDao.insert("ddd",1);
        userDao.insert("fff",1);
        int num = userDao.insert(name,age);

        return 1;
    }

    @GetMapping("/countUser")
    public int countUser(){
        int num = userDao.count();

        return num;
    }

}
