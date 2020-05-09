package com.aote.factory.absFactory.order;

import com.aote.factory.absFactory.LDCheesePizza;
import com.aote.factory.absFactory.LDPepperPizza;
import com.aote.factory.absFactory.Pizza;

/**
 * @author: Weicf
 * @date: 2020-05-09 13:59
 * @description: 抽象工厂的具体实现
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}