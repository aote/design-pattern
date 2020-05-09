package com.aote.factory.absFactory.order;


import com.aote.factory.absFactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author aote
 * @Date 2020-04-22 00:16
 * @Version 1.0
 * @Description 定义一个抽象的方法工厂
 **/
public abstract class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        this.factory = factory;
        this.factory = factory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza kind:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
