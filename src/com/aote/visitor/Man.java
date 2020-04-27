package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:08
 * @Version 1.0
 * @Description
 * 这里使用到了双分派，即首先在客户端程序中将具体状态作为参数传递到man中(第一次分派)
 * 然后Man类调用了作为参数的"具体方法"中的方法getManResult，同时将this作为参数传入，
 * 完成第二次分派。
 **/
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
