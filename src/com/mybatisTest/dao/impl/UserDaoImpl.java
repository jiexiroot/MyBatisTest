package com.mybatisTest.dao.impl;

import com.mybatisTest.dao.UserDao;
import com.mybatisTest.mapper.UsersMapper;
import com.mybatisTest.pojo.User;
import com.mybatisTest.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


/**
 * UserDaoImpl类实现UserDao接口，用MyBatis框架实现登录验证
 * @author GOU
 * @Date 2020-04-08 11:09
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    /**
     * 得到SqlSession
     */
    SqlSession sqlSession= MyBaitsUtils.getSession();
    @Override
    public boolean doLogin(String loginId, String loginPwd) {
        User user=new User();
        user.setLoginId(loginId);
        user.setLoginPwd(loginPwd);
        int row=sqlSession.selectOne("com.mybatisTest.mapper.UsersMapper.doLogin",user);
        sqlSession.close();
        return row>0?true:false;
    }

    @Override
    public boolean doRegister(String name, String password, String nickname, String address, String phone, String mail) {
        User user=new User(name,password,nickname,address,phone,mail);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user",user);
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        usersMapper.doRegister(map);
        sqlSession.commit();
        sqlSession.close();
        int result=Integer.parseInt(map.get("flag").toString());
        return result!=0?true:false;
    }
}
