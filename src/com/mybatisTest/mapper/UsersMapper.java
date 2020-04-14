package com.mybatisTest.mapper;



import com.mybatisTest.pojo.User;
import org.apache.ibatis.annotations.Param;

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
    /**
     * 用来模糊查找的代理类方法
     * @param properties 列名与Value值存在Properties中
     * @return 返回查询到的User的List对象
     */
    List<User> selectByFuzzy(Properties properties);

    /**
     * 用来修改指定列的值的代理类方法
     * @param properties 列名，原先值originalValue，修改值modifiedValue
     * @return 返回数据库中所受影响的行数
     */
    int editByColumn(Properties properties);

    /**
     *通过Sql注入实现查询到所有用户信息
     * @param LoginId 查询值
     * @return Sql注入所查询到的User列表
     */
    List<User> doSelectBySQL(@Param("searchValue") String LoginId);

    /**
     * 通过Call函数调用来实现登录功能
     * @param user 通过自动映射将用户名与密码注入到User对象中
     * @return  1为登录成功 0为登录失败
     */
    int doLoginByCall(User user);
}
