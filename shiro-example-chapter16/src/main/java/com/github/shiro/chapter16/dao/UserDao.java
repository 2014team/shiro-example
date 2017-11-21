package com.github.shiro.chapter16.dao;

import java.util.List;

import com.github.shiro.chapter16.entity.User;
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
