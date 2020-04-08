package com.mybatisTest.mapper;



import java.util.Map;

/**
 * @author GOU
 * @Date 2020-04-08 13:30
 */
public interface UsersMapper {
    //注册
    void doRegister(Map<String,Object> dataMap);
}
