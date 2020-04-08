package com.mybatisTest.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GOU
 *
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.mybatisTest.dao.impl.*.* (..))")
    private void myPointCut() {}
    /**
     * 模拟权限检查的方法
     */
    @Before("myPointCut()")
    public void checkPermission() {
        System.out.println("权限检查");
    }
    /**
     * 模拟日志记录的方法
     */
    @AfterReturning("myPointCut()")
    public void log() {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间，也可使用当前时间戳
        String date = df.format(new Date());
        System.out.println("日志记录,当前时间："+date);
    }


}