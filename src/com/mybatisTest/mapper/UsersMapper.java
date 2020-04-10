package com.mybatisTest.mapper;



import com.mybatisTest.pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author GOU
 * @Date 2020-04-08 13:30
 */
public interface UsersMapper {
    /**
     * 用来登录的代理类方法
     * @param user 通过自动映射将用户名与密码注入到User对象中
     * @return  1为登录成功 0为登录失败
     */
    int doLogin(User user);
    /**
     * 用来注册用户的代理类方法
     * @param dataMap map对象由{"user",user}与{"result",resultId}组成
     */
    void doRegister(Map<String,Object> dataMap);

    List<User> selectByFuzzy(Properties properties);
}
