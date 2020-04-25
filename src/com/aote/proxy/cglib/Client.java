package com.aote.proxy.cglib;

import net.sf.cglib.proxy.Proxy;

/**
 * @Author aote
 * @Date 2020-04-26 00:05
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        TeacherDao target = new TeacherDao();
        // 获取代理对象
        TeacherDao teacherDaoProxy = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        // 执行代理对象方法，会触发intercept方法
        teacherDaoProxy.teach();
    }

}
