package com.atguigu.dao.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl extends SqlSessionDaoSupport {


    @Autowired//①将Spring容器中的SqlSessionFactory对象注入
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {//设置SqlSessionFactory对象

        super.setSqlSessionFactory(sqlSessionFactory);//设置SqlSessionDaoSupport类的SqlSessionFactory对象

    }

}
