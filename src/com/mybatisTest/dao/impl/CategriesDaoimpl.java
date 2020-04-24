package com.mybatisTest.dao.impl;

import com.mybatisTest.dao.CategoriesDao;
import com.mybatisTest.mapper.CategoriesMapper;
import com.mybatisTest.pojo.Categories;
import com.mybatisTest.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * @author GOU
 * @Date 2020-04-24 16:27
 */
@Repository("categriesDao")
public class CategriesDaoimpl implements CategoriesDao {
    /**
     * 得到SqlSession
     */
    SqlSession sqlSession= MyBaitsUtils.getSession();
    CategoriesMapper categoriesMapper=sqlSession.getMapper(CategoriesMapper.class);
    @Override
    public Categories findCategoriesByCategoryId(int cid) {
        Categories categories=categoriesMapper.findCategoriesByCategoryId(cid);
        sqlSession.close();
        return categories;
    }

    @Override
    public Categories findCategoriesByCategoryId2(int cid) {
        Categories categories=categoriesMapper.findCategoriesByCategoryId2(cid);
        sqlSession.close();
        return categories;
    }
}
