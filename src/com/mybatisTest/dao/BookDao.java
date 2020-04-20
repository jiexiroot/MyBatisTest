package com.mybatisTest.dao;

import com.mybatisTest.pojo.Books;

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
}
