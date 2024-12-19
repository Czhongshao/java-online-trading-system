package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.Users;

public interface UsersService {
    /**
     * 新增用户
     * @param users 用户对象
     * @return 受影响的行数
     */
    public int addUsers(Users users);
}
