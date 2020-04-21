package com.aote.singleton;

/**
 * 懒汉式同步代码块
 * 在现实开发中不能这样写
 */
public class Singleton5 {

    private static Singleton5 instance = null;

    // 在这里加上synchronized还是起不到线程安全的作用
    public synchronized static Singleton5 getInstance() {
        if(instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }

    private Singleton5() {
    }

}