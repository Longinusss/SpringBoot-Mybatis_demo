package com.lon.springboot_mybatis_demo.controller;

import com.lon.springboot_mybatis_demo.mapper.UserMapper;
import com.lon.springboot_mybatis_demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

    @RestController
    @RequestMapping("/user")
    public class UserController {
        @Autowired
        private UserMapper userMapper;

        @RequestMapping
        public User findUser(@Param(value = "id") int id){
            return userMapper.findById(id);
        }
    }

