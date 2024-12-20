package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    int insertUsers(Users users);  // 插入新用户

    List<Users> selectAllUsers();  // 获取所有用户

    Users selectUserById(@Param("id") Integer id);  // 根据ID获取用户

    int updateUser(Users users);  // 更新用户信息

    int deleteUserById(@Param("id") Integer id);  // 根据ID删除用户
}