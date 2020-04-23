package com.aote.decorator;

import com.aote.decorator.coffee.Latte;
import com.aote.decorator.feed.Chocolate;
import com.aote.decorator.feed.Milk;

/**
 * @Author aote
 * @Date 2020-04-24 00:17
 * @Version 1.0
 * @Description Client
 **/
public class Cafe {

    public static void main(String[] args) {
        // 先点一份咖啡
        Drink latte = new Latte();
        // 加牛奶
        latte = new Milk(latte);
        latte = new Milk(latte);
        latte = new Chocolate(latte);
        System.out.println(latte.getDes());
        System.out.println(latte.cost());
    }

}
