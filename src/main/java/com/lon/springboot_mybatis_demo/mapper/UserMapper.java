package com.lon.springboot_mybatis_demo.mapper;

import com.lon.springboot_mybatis_demo.pojo.User;

import java.util.List;
    public interface UserMapper {
        User findById(int id);
        List<User> findAll();
    }

