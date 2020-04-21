package com.aote.singleton;

/**
 * 饿汉式静态代码块
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    static{
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    private Singleton2() {
    }

}
