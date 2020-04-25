package com.aote.proxy.staticProxy;

/**
 * @Author aote
 * @Date 2020-04-25 23:21
 * @Version 1.0
 * @Description 代理对象
 **/
public class TeacherDaoProxy implements ITeacherDao {

    // 目标对象(被代理对象)，通过接口聚合
    ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        target.teach();
        System.out.println("结束代理");
    }

}
