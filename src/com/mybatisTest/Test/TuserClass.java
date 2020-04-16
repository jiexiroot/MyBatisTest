package com.mybatisTest.Test;

import com.mybatisTest.dao.TuserDao;
import com.mybatisTest.pojo.Tuser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * @author GOU
 * @Date 2020-04-16 16:31
 */
public class TuserClass {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatisTest/applicationContext.xml");
    TuserDao tuserDAO=(TuserDao) context.getBean("tuserDao");

    @Test
    public void select(){
        List<Tuser> list=tuserDAO.findAllUsers();
        for(Tuser tuser:list) {
            System.out.println(tuser);
        }
    }
}
