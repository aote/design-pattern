package com.aote.proxy.staticProxy;

/**
 * @Author aote
 * @Date 2020-04-25 23:21
 * @Version 1.0
 * @Description 被代理对象
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。");
    }
}
