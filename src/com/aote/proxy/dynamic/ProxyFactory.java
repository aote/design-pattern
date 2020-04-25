package com.aote.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author aote
 * @Date 2020-04-25 23:33
 * @Version 1.0
 * @Description TODO
 **/
public class ProxyFactory {

    // 维护一个目标对象，Object
    private Object target;

    // 通过构造器对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生产一个实例

    /**
     * ClassLoader loader 指定当前目标对象的类加载器,获取加载器方法固定
     * Class<?>[] interfaces 目标对象实现的接口类型，使用泛型确认类型
     * InvocationHandler h 事件处理，执行目标对象的方法，会触发事情处理器方法
     *                      会把目标对象的方法作为参数传入
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                // 以匿名对象传入
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        // 反射机制调用目标对象方法
                        Object returnVal = method.invoke(target,args);
                        return returnVal;
                    }
                });
    }

}
