package com.aote.singleton;

/**
 * 静态内部类实现单例模式
 * 1.静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才
 * 2.会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
 * 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 3.类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，
 * 在类进行初始化时，别的线程是无法进入的。
 * 4.优点:避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。
 */
public class Singleton6 {

    // 使用静态内部类
    private static class SingletonInstance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public  static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }


    private Singleton6() {
    }

}