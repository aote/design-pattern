package com.aote.proxy.dynamic;

/**
 * @Author aote
 * @Date 2020-04-25 23:40
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao target = new TeacherDao();
        // 创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // 输出返回类型，返回com.aote.proxy.dynamic.TeacherDao@d716361
        // System.out.println(proxyInstance);

        /**
         * 内存中动态生成了代理对象
         * 返回class com.sun.proxy.$Proxy0，
         */
        // System.out.println(proxyInstance.getClass());

        proxyInstance.teach();
    }

}
