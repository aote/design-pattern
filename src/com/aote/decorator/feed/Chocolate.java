package com.aote.decorator.feed;

import com.aote.decorator.Decorator;
import com.aote.decorator.Drink;

/**
 * @Author aote
 * @Date 2020-04-24 00:16
 * @Version 1.0
 * @Description 调味品，是具体的Decorator
 **/
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(6);
    }

}
