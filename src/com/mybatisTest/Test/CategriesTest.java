package com.mybatisTest.Test;

import com.mybatisTest.dao.BookDao;
import com.mybatisTest.dao.CategoriesDao;
import com.mybatisTest.pojo.Categories;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GOU
 * @Date 2020-04-24 16:58
 */
public class CategriesTest {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatisTest/applicationContext.xml");
    CategoriesDao categoriesDao=(CategoriesDao) context.getBean("categriesDao");
    @Test
    public void selectCid(){
        Categories categories=categoriesDao.findCategoriesByCategoryId(1);
        System.out.println(categories);
    }
    @Test
    public void selectCid2(){
        Categories categories=categoriesDao.findCategoriesByCategoryId2(1);
        System.out.println(categories);
    }
}
