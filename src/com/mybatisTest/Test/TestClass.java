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
    @Test
    public void domain(){
        System.out.println("请输入你所要操作的参数\n1.登录系统2.注册用户3.模糊查找列名的值4.修改列值");
        int chooseId=0;
        try {
            chooseId=Integer.parseInt(inputScanner.next());
        } catch (NumberFormatException e) {
            System.err.println("错误的输入参数，请检查");
            domain();
        }
        switch (chooseId){
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                selectByFuzzy();
                break;
            case 4:
                editColumn();
                break;
            default:
                System.err.println("错误的输入参数，请检查");
                domain();
        }
    }

    @org.junit.Test
    public void login(){
        System.out.println("请输入用户名：");
        //提取上方next()中留下的‘\n’，清空输入框
        inputScanner.nextLine();
        String loginId=inputScanner.nextLine();
        System.out.println("请输入密码：");
        String loginPwd=inputScanner.nextLine();
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
    @Test
    public void update(){
        System.out.println("请输入用户名：");
        String loginId=inputScanner.next();
        System.out.println("请输入旧密码：");
        String oldPassword=inputScanner.next();
        System.out.println("请输入新密码");
        String newPassword=inputScanner.next();
        if(userDAO.updateByUser(loginId,newPassword,oldPassword)){
            System.out.println("用户修改成功！");
        }
        else{
            System.out.println("用户修改失败，错误用户名或秘密！");
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
        String columnName="";
        while(true){
            System.out.println("请输入列名：");
            columnName=inputScanner.next();
            if("LoginId".equals(columnName) || "LoginPwd".equals(columnName) || "Name".equals(columnName) ||
                "Address".equals(columnName) || "Phone".equals(columnName) || "Mail".equals(columnName)){
                break;
            }else{
                System.out.println("输入错误的列名，重新输入");
            }
        }
        System.out.println("请输入原先的值");
        String originalValue=inputScanner.next();
        System.out.println("请输入修改的值");
        String modifiedValue=inputScanner.next();
         if(userDAO.editByColumn(columnName,originalValue,modifiedValue)){
             System.out.println("修改成功！");
         }
         else{
             System.out.println("修改失败，未找到原先的值！");
         }

    }
    @Test
    public void sqlSelect(){
        System.out.println("请输入所要查询的LoginId值");
        String queryValue=inputScanner.nextLine();
        List<User> userList = userDAO.doSelectLoginId(queryValue);
        for (User user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void callLogin(){
        System.out.println("请输入用户名：");
        String loginId=inputScanner.next();
        System.out.println("请输入密码：");
        String loginPwd=inputScanner.next();
        if(userDAO.doLoginByCall(loginId, loginPwd)){
            System.out.println("用户登录成功！");
        }
        else{
            System.out.println("用户登录失败！");
        }
    }
}
