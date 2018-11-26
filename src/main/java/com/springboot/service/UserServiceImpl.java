package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Integer count() {
        return jdbcTemplate.queryForObject("select count(1) from upload_file",Integer.class);
    }
}
