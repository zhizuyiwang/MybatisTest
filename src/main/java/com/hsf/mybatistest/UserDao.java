package com.hsf.mybatistest;

public interface UserDao {
    public User findUserById(int id) throws Exception;
    public void insertUser(User user) throws Exception;
}
