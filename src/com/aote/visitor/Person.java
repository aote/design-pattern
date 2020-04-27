package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:07
 * @Version 1.0
 * @Description
 **/
public abstract class Person {

    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);

}
