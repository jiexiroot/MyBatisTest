package com.mybatisTest.dao;

import com.mybatisTest.pojo.Books;
import com.mybatisTest.pojo.Categories;

import java.util.List;

/**
 * 对数据库中的Books进行操作的Dao层
 * @author GOU
 * @Date 2020-04-20 11:50
 */
public interface BookDao {
    /**
     * 得到种类为categoriesId中的图书信息
     * @param categoriesId 查询条件
     * @return 图书信息
     */
    List<Books> selectByCategoryId(List<Long> categoriesId);
    /**
     * 根据图书种类的id,得到该种类包含的所有图书信息
     * @param cid 图书种类的id
     * @return 图书列表
     */
    List<Books> findBookByCategoryId(int cid);
    /**
     * 一对一 使用嵌套结果
     * 按照图书的id查询这本书的信息
     * @param id 图书ID
     * @return 指定id的图书信息
     */
    Books findBookById(int id);
    /**
     * 一对一 使用嵌套查询语句
     * 按照图书的id查询这本书的信息
     * @param id 图书ID
     * @return 指定id的图书信息
     */
    Books findBookById2(int id);
}
