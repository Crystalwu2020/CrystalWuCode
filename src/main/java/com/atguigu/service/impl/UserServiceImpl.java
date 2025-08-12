package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    //管理员
    public Integer insert(User user) throws Exception {
        Integer insert = userDao.insert(user);
        return insert;
    }


    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }


    public User getById(Integer id) throws Exception {
        User user = userDao.getById(id);
        return user;
    }

    public Integer delete(Integer id) throws Exception {
        return userDao.delete(id);
    }

    public Integer update(User user) throws Exception {
        return userDao.update(user);
    }


}
