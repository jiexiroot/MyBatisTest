package com.mybatisTest.mapper;

import com.mybatisTest.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-20 12:03
 */
public interface BookMapper {
    /**
     * 得到种类为categoriesId中的图书信息
     * @param categoriesId 查询条件
     * @return 图书信息
     */
    List<Books> selectByCategoryId(@Param("categoriesList") List<Long> categoriesId);
}
