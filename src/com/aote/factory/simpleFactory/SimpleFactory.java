package com.aote.factory.simpleFactory;

import com.aote.factory.simpleFactory.pizza.CheesePizza;
import com.aote.factory.simpleFactory.pizza.GreekPizza;
import com.aote.factory.simpleFactory.pizza.PepperPizza;
import com.aote.factory.simpleFactory.pizza.Pizza;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-21 23:40
 * @Version 1.0
 **/
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
