package com.aote.decorator;

/**
 * @Author aote
 * @Date 2020-04-24 00:06
 * @Version 1.0
 * @Description TODO
 **/
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
