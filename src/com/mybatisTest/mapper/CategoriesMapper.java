package com.mybatisTest.mapper;

import com.mybatisTest.pojo.Categories;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-24 16:32
 */
public interface CategoriesMapper {

    /**
     * 嵌套语句查询
     * CategoriesDAO接口提供按照种类id查询种类信息及该种类所包含的图书的id, title , author , unitPrice
     * @param cid 种类的id
     * @return  种类的信息和对应的图书的信息
     */
    Categories findCategoriesByCategoryId(@Param("id") int cid);
    /**
     * 嵌套结果查询
     * CategoriesDAO接口提供按照种类id查询种类信息及该种类所包含的图书的id, title , author , unitPrice
     * @param cid 种类的id
     * @return  种类的信息和对应的图书的信息
     */
    Categories findCategoriesByCategoryId2(@Param("id") int cid);

    /**
     * 一对一查询 中使用嵌套语句查询的 方法 用于通过指定cid查询该id的种类信息
     * @param cid 种类的id
     * @return 种类的信息
     */
    Categories findCategoriesById(@Param("id") int cid);
}
