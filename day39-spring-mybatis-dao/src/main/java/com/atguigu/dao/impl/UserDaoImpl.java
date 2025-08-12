package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 实现子类: 确定dao接口中的方法和mapper映射文件中的statement的关系
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;//单例对象

    @Override
    public Integer insert(User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("insert", user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

    @Override
    public Integer delete(Integer id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int delete = sqlSession.delete("delete", id);
        sqlSession.commit();
        sqlSession.close();
        return delete;
    }

    @Override
    public Integer update(User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int update = sqlSession.update("update", user);
        sqlSession.commit();
        sqlSession.close();
        return update;
    }

    @Override
    public User getById(Integer id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("getById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findAll() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("findAll");
        sqlSession.close();
        return userList;
    }

}
