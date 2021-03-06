package com.mybatisTest.dao.impl;

import com.mybatisTest.dao.UserDao;
import com.mybatisTest.mapper.UsersMapper;
import com.mybatisTest.pojo.User;
import com.mybatisTest.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


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
    UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
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
        usersMapper.doRegister(map);
        sqlSession.commit();
        sqlSession.close();
        int result=Integer.parseInt(map.get("flag").toString());
        return result!=0?true:false;
    }

    @Override
    public List<User> selectByFuzzy(String columnName, String columnValue) {
        Properties properties=new Properties();
        properties.setProperty("columnName",columnName);
        properties.setProperty("columnValue",columnValue);
        List<User> list = usersMapper.selectByFuzzy(properties);
        sqlSession.close();
        return list;
    }

    @Override
    public boolean editByColumn(String columnName, String originalValue, String modifiedValue) {
        Properties properties=new Properties();
        properties.setProperty("columnName",columnName);
        properties.setProperty("originalValue",originalValue);
        properties.setProperty("modifiedValue",modifiedValue);
        int result=usersMapper.editByColumn(properties);
        sqlSession.commit();
        return result!=0?true:false;
    }

    @Override
    public List<User> doSelectLoginId(String LoginId) {
        return usersMapper.doSelectBySQL(LoginId);
    }

    @Override
    public boolean doLoginByCall(String loginId, String loginPwd) {
        User user=new User();
        user.setLoginId(loginId);
        user.setLoginPwd(loginPwd);
        return usersMapper.doLoginByCall(user)!=0?true:false;
    }

    @Override
    public List<User> selectByIf(User user) {
        return usersMapper.queryByif(user);
    }

    @Override
    public boolean registerByWhere(User user) {
        usersMapper.registerByWhere(user);
        return true;
    }

    @Override
    public boolean updateByUser(String username, String newPassword, String oldPassword) {
        int i=usersMapper.updateByPassword(username, newPassword, oldPassword);
        System.out.println("受影响的结果集为："+i);
        return i==1?true:false;
    }
}
