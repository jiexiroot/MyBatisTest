package com.mybatisTest.dao;

import com.mybatisTest.pojo.Tuser;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-16 15:45
 */
public interface TuserDao {
    /**
     * 查找Tuser表中所有数据
     * @return list的Tuser对象
     */
    List<Tuser> findAllUsers();
}
