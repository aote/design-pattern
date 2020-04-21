package com.aote.singleton;

/**
 * 懒汉式
 * 1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，
 * 就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * 2) 结论:这种单例模式可用，但是可能造成内存浪费
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    private Singleton3() {
    }

}
