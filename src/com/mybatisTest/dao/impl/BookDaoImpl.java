package com.mybatisTest.dao.impl;

import com.mybatisTest.dao.BookDao;
import com.mybatisTest.mapper.BookMapper;
import com.mybatisTest.pojo.Books;
import com.mybatisTest.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-20 12:01
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    /**
     * 得到SqlSession
     */
    SqlSession sqlSession= MyBaitsUtils.getSession();
    BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
    @Override
    public List<Books> selectByCategoryId(List<Long> categoriesId) {
        List<Books> list=bookMapper.selectByCategoryId(categoriesId);
        sqlSession.close();
        return list;
    }

    @Override
    public List<Books> findBookByCategoryId(int cid) {
        List<Books> list=bookMapper.findBookByCategoryId(cid);
        sqlSession.close();
        return list;
    }

    @Override
    public Books findBookById(int id) {
        Books books=bookMapper.findBookById(id);
        sqlSession.close();
        return books;
    }

    @Override
    public Books findBookById2(int id) {
        Books books=bookMapper.findBookById2(id);
        sqlSession.close();
        return books;
    }
}
