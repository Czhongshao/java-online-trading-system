package com.nan.javaonlinetradingsystem.controller;


import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsersConntroller {


    @Autowired
    private UsersService usersService; // 注入服务层

    /**
     * 添加用户
     * @param users 用户对象，从请求体中解析
     * @return 受影响的行数
     */
    @PutMapping("/add")
    public int addUsers(@RequestBody Users users) { // 使用 @RequestBody 解析请求体
        return usersService.addUsers(users);
    }
}