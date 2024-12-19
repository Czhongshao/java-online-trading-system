package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.Users;

public interface UsersService {
    /**
     * 新增用户
     * @param users 用户对象
     * @return 受影响的行数
     */
    int addUsers(Users users);  // 这个方法名需要与实现类一致
}

