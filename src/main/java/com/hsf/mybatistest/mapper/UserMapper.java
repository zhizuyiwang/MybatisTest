package com.hsf.mybatistest.mapper;

import com.hsf.mybatistest.User;

public interface UserMapper {
    public User findUserById(int id) throws Exception;
    public void insertUser(User user) throws Exception;
}
