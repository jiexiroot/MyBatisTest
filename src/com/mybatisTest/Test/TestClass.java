package com.mybatisTest.Test;

import com.mybatisTest.dao.UserDao;


import com.mybatisTest.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
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
    @org.junit.Test
    public void selectByFuzzy(){
        System.out.println("请输入列名：");
        String columnName=inputScanner.next();
        System.out.println("请输入该列需要模糊查找的值：");
        String columnValue=inputScanner.next();
        List<User> userList = userDAO.selectByFuzzy(columnName,columnValue);
        for (User user:userList){
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void editColumn(){
        System.out.println("请输入列名：");
        String columnName=inputScanner.next();
        System.out.println("请输入原先的值");
        String originalValue=inputScanner.next();
        System.out.println("请输入修改的值");
        String modifiedValue=inputScanner.next();
         if(userDAO.editByColumn(columnName,originalValue,modifiedValue)){
             System.out.println("修改成功！");
         }
         else{
             System.out.println("修改失败，未找到原先的值或是错误的列名，");
         }

    }
}
