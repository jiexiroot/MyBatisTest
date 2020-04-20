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
 * @Date 2020-04-17 20:26
 */
public class SelectTest {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatisTest/applicationContext.xml");
    UserDao userDAO=(UserDao) context.getBean("userDao");
    Scanner inputScanner=new Scanner(System.in);
    @Test
    public void select(){
        System.out.println("请输入你所要操作的参数用‘-’分隔\n1.通过LoginId查询2.通过LoginPwd查询3.通过Name查询4.通过Address查询5.通过Phone查询6.通过Mail查询");
        String chooseId =inputScanner.next();
        String[] optionGrouping =chooseId .split("-");
        User user=new User();
        for (String s:optionGrouping) {
            switch (s) {
                case "1":
                    System.out.println("请输入所有模糊查找的LoginId值");
                    String loginId = inputScanner.next();
                    user.setLoginId(loginId);
                    break;
                case "2":
                    System.out.println("请输入所有模糊查找的LoginPwd值");
                    String loginPwd = inputScanner.next();
                    user.setLoginPwd(loginPwd);
                    break;
                case "3":
                    System.out.println("请输入所有模糊查找的Name值");
                    String name = inputScanner.next();
                    user.setName(name);
                    break;
                case "4":
                    System.out.println("请输入所有模糊查找的Address值");
                    String address = inputScanner.next();
                    user.setAddress(address);
                    break;
                case "5":
                    System.out.println("请输入所有模糊查找的Phone值");
                    String phone = inputScanner.next();
                    user.setPhone(phone);
                    break;
                case "6":
                    System.out.println("请输入所有模糊查找的Mail值");
                    String mail = inputScanner.next();
                    user.setMail(mail);
                    break;
                default:
                    break;
            }
        }
        List<User> list=userDAO.selectByIf(user);
        for(User us:list){
            System.out.println(us);
        }
    }
    @Test
    public void register(){
        System.out.println("请输入用户名：");
        String loginId=inputScanner.next();
        System.out.println("请输入密码：");
        String loginPwd=inputScanner.next();
        System.out.println("请输入昵称");
        String nickname=inputScanner.next();
        System.out.println("请输入地址");
        String address=inputScanner.next();
        System.out.println("请输入电话号码");
        String phone=inputScanner.next();
        System.out.println("请输入用户角色Id");
        String UserRoleId=inputScanner.next();
        System.out.println("请输入用户是否有效Id");
        String UserStateId=inputScanner.next();
        User user=new User(loginId,loginPwd,nickname,address,phone,"",Integer.parseInt(UserRoleId),Integer.parseInt(UserStateId));
        System.out.println(user);
        if(userDAO.registerByWhere(user)){
            System.out.println("用户注册成功！");
        }
        else{
            System.out.println("用户注册失败，有重复用户名！");
        }

    }
}
