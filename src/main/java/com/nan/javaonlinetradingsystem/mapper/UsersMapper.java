package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    int insertUsers(Users users);  // 注意方法名和 SQL 映射 id 要一致
}

