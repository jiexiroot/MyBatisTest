package com.mybatisTest.dao;

import com.mybatisTest.pojo.User;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-08 11:08
 */
public interface UserDao {
    /**
     * 用户登录方法
     * @param loginId 用户登录名
     * @param loginPwd 密码
     * @return true 代表登录成功  false代表登录失败
     */
    boolean doLogin(String loginId, String loginPwd);
    /**
     * 用户注册方法
     * @param name 		用户登录名
     * @param password	用户密码
     * @param nickname	用户昵称（选填）
     * @param address	用户地址（选填）
     * @param phone		用户电话（选填）
     * @param mail		用户邮箱（选填）
     * @return	true 代表用户登录名在数据库中没有重复，注册成功	false 代表用户登录名在数据库中存在，注册失败
     */
    boolean doRegister(String name, String password, String nickname, String address, String phone, String mail);
    /**
     * 用来通过输入列名与所要模糊查找的属性值，来对users表模糊查找
     * @param columnName    列名
     * @param columnValue   所要查询的值
     * @return  返回模糊查找后包含所要的查询的user对象
     */
    List<User> selectByFuzzy(String columnName,String columnValue);

    /**
     * 修改列值
     * @param columnName        列名
     * @param originalValue     原先值
     * @param modifiedValue     修改值
     * @return  true 代表修改成功 false 代表修改失败
     */
    boolean editByColumn(String columnName,String originalValue,String modifiedValue);
}
