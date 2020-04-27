package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:08
 * @Version 1.0
 * @Description TODO
 **/
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
