package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:23
 * @Version 1.0
 * @Description TODO
 **/
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价待定");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人评价待定");
    }
}
