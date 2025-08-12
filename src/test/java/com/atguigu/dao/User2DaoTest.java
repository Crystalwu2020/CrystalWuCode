package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-core.xml")
public class User2DaoTest {

    @Autowired
    private User2Dao userDao2;
    @Test
    public void getById() throws Exception {
        User user = userDao2.getById(280);
        System.out.println("user = " + user);
    }
}