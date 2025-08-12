package com.atguigu.dao.impl;

import com.atguigu.dao.User2Dao;
import com.atguigu.dao.base.BaseDaoImpl;
import com.atguigu.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 实现子类: 确定dao接口中的方法和mapper映射文件中的statement的关系
 */
@Repository
public class User2DaoImpl extends BaseDaoImpl implements User2Dao {


    @Override
    public Integer insert(User user) throws Exception {
        int insert = getSqlSession().insert("test2.insert", user);
        return insert;
    }

    @Override
    public Integer delete(Integer id) throws Exception {
        int delete = getSqlSession().delete("test2.delete", id);
        return delete;
    }

    @Override
    public Integer update(User user) throws Exception {
        int update = getSqlSession().update("test2.update", user);
        return update;
    }

    @Override
    public User getById(Integer id) throws Exception {
        User user = getSqlSession().selectOne("test2.getById", id);
        return user;
    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> userList = getSqlSession().selectList("test2.findAll");
        return userList;
    }

}
