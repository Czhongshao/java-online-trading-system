package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.mapper.UsersMapper;
import com.nan.javaonlinetradingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int addUsers(Users users) {
        return usersMapper.insertUsers(users);  // 确保调用了正确的 Mapper 方法
    }
}
