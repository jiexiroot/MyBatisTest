package com.mybatisTest.Test;

import com.mybatisTest.dao.UserDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author GOU
 * @Date 2020-04-08 11:48
 */
public class TestClass {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatisTest/applicationContext.xml");
    UserDao userDAO=(UserDao) context.getBean("userDao");
    Scanner inputScanner=new Scanner(System.in);
    @org.junit.Test
    public void login(){
        System.out.println("请输入用户名：");
        String loginId=inputScanner.next();
        System.out.println("请输入密码：");
        String loginPwd=inputScanner.next();
        if(userDAO.doLogin(loginId, loginPwd)){
            System.out.println("用户登录成功！");
        }
        else{
            System.out.println("用户登录失败！");
        }
    }
    @org.junit.Test
    public void register(){
        System.out.println("请输入用户名：");
        String loginId=inputScanner.next();
        System.out.println("请输入密码：");
        String loginPwd=inputScanner.next();
        System.out.println("请输入昵称");
        String nickname=inputScanner.next();
        System.out.println("请输入电话号码");
        String phone=inputScanner.next();
        if(userDAO.doRegister(loginId, loginPwd,nickname,"",phone,"")){
            System.out.println("用户注册成功！");
        }
        else{
            System.out.println("用户注册失败，有重复用户名！");
        }
    }
}
