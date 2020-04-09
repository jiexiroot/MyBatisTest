package com.mybatisTest.mapper;



import java.util.Map;

/**
 * @author GOU
 * @Date 2020-04-08 13:30
 */
public interface UsersMapper {
    /**
     * 用来注册用户的代理类方法
     * @param dataMap map对象由{"user",user}与{"result",resultId}组成
     */
    void doRegister(Map<String,Object> dataMap);
}
