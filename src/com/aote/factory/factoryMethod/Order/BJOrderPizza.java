package com.aote.factory.factoryMethod.Order;

import com.aote.factory.factoryMethod.BJCheesePizza;
import com.aote.factory.factoryMethod.BJPepperPizza;
import com.aote.factory.factoryMethod.Pizza;

/**
 * @Description 实现工厂方法类的子类
 * @Author aote
 * @Date 2020-04-22 00:23
 * @Version 1.0
 **/
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("BJ cheese");
        } else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("BJ pepper");
        }
        return pizza;
    }

}
