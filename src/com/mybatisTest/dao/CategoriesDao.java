package com.mybatisTest.dao;

import com.mybatisTest.pojo.Categories;

/**
 * @author GOU
 * @Date 2020-04-24 16:25
 */
public interface CategoriesDao {
    /**
     * 嵌套查询语句
     * CategoriesDAO接口提供按照种类id查询种类信息及该种类所包含的图书的id, title , author , unitPrice
     * @param cid 种类的id
     * @return  种类的信息和对应的图书的信息
     */
    Categories findCategoriesByCategoryId(int cid);
    /**
     * 嵌套结果查询
     * CategoriesDAO接口提供按照种类id查询种类信息及该种类所包含的图书的id, title , author , unitPrice
     * @param cid 种类的id
     * @return  种类的信息和对应的图书的信息
     */
    Categories findCategoriesByCategoryId2(int cid);
}
