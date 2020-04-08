package com.mybatisTest.dao;

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
}
