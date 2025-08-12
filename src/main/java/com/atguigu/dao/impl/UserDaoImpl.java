package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.base.BaseDaoImpl;
import com.atguigu.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 实现子类: 确定dao接口中的方法和mapper映射文件中的statement的关系
 */
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    @Autowired//将Spring容器中的SqlSessionFactory注入
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);//给SqlSessionDaoSupport类的SqlSessionFactory赋值
    }

    @Override
    public Integer insert(User user) throws Exception {
        int insert = getSqlSession().insert("test.insert", user);
        return insert;
    }

    @Override
    public Integer delete(Integer id) throws Exception {
        int delete = getSqlSession().delete("test.delete", id);
        return delete;
    }

    @Override
    public Integer update(User user) throws Exception {
        int update = getSqlSession().update("test.update", user);
        return update;
    }

    @Override
    public User getById(Integer id) throws Exception {
        User user = getSqlSession().selectOne("test.getById", id);
        return user;
    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> userList = getSqlSession().selectList("test.findAll");
        return userList;
    }

}
