package com.mybatisTest.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 工具类，用户得到SqlSession
 * @author GOU
 * @Date 2020-04-08 11:34
 */
public class MyBaitsUtils {
    static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            Reader reader= Resources.getResourceAsReader("com/mybatisTest/mybatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
