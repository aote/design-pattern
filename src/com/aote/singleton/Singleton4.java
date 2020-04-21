package com.aote.singleton;

/**
 * 懒汉式同步代码块
 */
public class Singleton4 {

    private static Singleton4 instance = null;

    public synchronized static Singleton4 getInstance() {
        if(instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    private Singleton4() {
    }

}