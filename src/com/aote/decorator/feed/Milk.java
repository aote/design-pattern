package com.aote.decorator.feed;

import com.aote.decorator.Decorator;
import com.aote.decorator.Drink;

/**
 * @Author aote
 * @Date 2020-04-24 00:15
 * @Version 1.0
 * @Description 调味品，是具体的Decorator
 **/
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(5);
    }

}
