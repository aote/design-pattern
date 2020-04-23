package com.aote.decorator.feed;

import com.aote.decorator.Decorator;
import com.aote.decorator.Drink;

/**
 * @Author aote
 * @Date 2020-04-24 00:16
 * @Version 1.0
 * @Description TODO
 **/
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(3);
    }

}
