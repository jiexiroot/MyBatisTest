package com.mybatisTest.Test;

import com.mybatisTest.dao.BookDao;
import com.mybatisTest.dao.UserDao;
import com.mybatisTest.pojo.Books;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GOU
 * @Date 2020-04-20 12:15
 */
public class BookTest {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatisTest/applicationContext.xml");
    BookDao bookDao=(BookDao) context.getBean("bookDao");
    @Test
    public void selectByCid(){
        List<Long> cid=new ArrayList<Long>();
        cid.add((long) 35);
        cid.add((long) 2);
        List<Books> booksList=bookDao.selectByCategoryId(cid);
        for (Books book:booksList) {
            System.out.println(book);
        }
    }
}
