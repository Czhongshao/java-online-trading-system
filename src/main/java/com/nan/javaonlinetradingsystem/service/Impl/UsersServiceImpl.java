package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.Users;
import com.nan.javaonlinetradingsystem.mapper.UsersMapper;
import com.nan.javaonlinetradingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int addUsers(Users users) {
        return usersMapper.insertUsers(users);  // 确保调用了正确的 Mapper 方法
    }

    @Override
    public List<Users> selectAllUsers() {
        return usersMapper.selectAllUsers();  // 假设Mapper中有selectAllUsers方法
    }

    @Override
    public Users selectUserById(Integer id) {
        return usersMapper.selectUserById(id);  // 假设Mapper中有selectUserById方法
    }

    @Override
    public int editUser(Users users) {
        return usersMapper.updateUser(users);  // 确保调用了正确的 Mapper 方法，注意方法名可能是 updateUser 而不是 updataCategory
    }

    @Override
    public int deleteUserById(Integer id) {
        return usersMapper.deleteUserById(id);  // 确保调用了正确的 Mapper 方法
    }
}