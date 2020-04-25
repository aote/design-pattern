package com.aote.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author aote
 * @Date 2020-04-26 00:11
 * @Version 1.0
 * @Description TODO
 **/
public class ProxyFactory implements MethodInterceptor {

    // 聚合一个目标对象
    private Object target;

    // 构造器传入一个被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 通过cglib提供的框架，返回一个代理对象，target对象的代理对象
    public Object getProxyInstance(){
        // 1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象(代理对象)
        return enhancer.create();
    }

    // 重写Intercept方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib开始代理");
        /**
         * target 是目标对象
         * args 是方法参数
         */
        Object returnVal = method.invoke(target,args);
        System.out.println("cglib结束代理");
        return returnVal;
    }



}
