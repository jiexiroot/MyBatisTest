package com.mybatisTest.dao.impl;

import com.mybatisTest.dao.TuserDao;
import com.mybatisTest.mapper.TusersMapper;
import com.mybatisTest.pojo.Tuser;
import com.mybatisTest.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-16 15:48
 */
@Repository("tuserDao")
public class TuserDaoImpl implements TuserDao {
    /**
     * 得到SqlSession
     */
    SqlSession sqlSession= MyBaitsUtils.getSession();
    @Override
    public List<Tuser> findAllUsers() {
        TusersMapper tusersMapper=sqlSession.getMapper(TusersMapper.class);
        List<Tuser> list=tusersMapper.selectAll();
        return list;
    }
}
