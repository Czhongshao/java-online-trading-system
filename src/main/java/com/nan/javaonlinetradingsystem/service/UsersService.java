package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.Users;
import java.util.List;

public interface UsersService {
    /**
     * 新增用户
     * @param users 用户对象
     * @return 受影响的行数
     */
    int addUsers(Users users);

    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    List<Users> selectAllUsers();

    /**
     * 根据用户ID获取用户信息
     * @param id 用户ID
     * @return 用户对象
     */
    Users selectUserById(Integer id);

    /**
     * 更新用户信息
     * @param users 用户对象
     * @return 受影响的行数
     */
    int editUser(Users users);

    /**
     * 根据用户ID删除用户
     * @param id 用户ID
     * @return 受影响的行数
     */
    int deleteUserById(Integer id);
}