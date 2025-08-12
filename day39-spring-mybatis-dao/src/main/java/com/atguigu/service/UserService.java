package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserService {

    Integer insert(User user) throws Exception;
    Integer delete(Integer id) throws Exception;
    Integer update(User user) throws Exception;
    User getById(Integer id) throws Exception;
    List<User> findAll( ) throws Exception;

}
