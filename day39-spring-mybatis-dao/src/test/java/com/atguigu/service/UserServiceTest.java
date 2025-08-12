package com.atguigu.service;

import com.atguigu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-core.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() throws Exception {
        userService.insert(
                new User(null,"中邱","zhongqiu",10000000)
        );
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getById() throws Exception {
        User user = userService.getById(280);
        System.out.println("user = " + user);
    }

    @Test
    public void findAll() {
    }
}