package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    // 新增用户的方法，返回值为影响的行数
    int insertUsers(Users users);  // 这是方法名
}

