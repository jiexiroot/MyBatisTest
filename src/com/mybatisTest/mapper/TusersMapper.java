package com.mybatisTest.mapper;

import com.mybatisTest.pojo.Tuser;

import java.util.List;

/**
 * @author GOU
 * @Date 2020-04-16 15:51
 */
public interface TusersMapper {
    /**
     * 查找Tuser表中所有数据
     * @return list的Tuser对象
     */
    List<Tuser>  selectAll();
}
