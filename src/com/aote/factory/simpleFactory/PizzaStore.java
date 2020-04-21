package com.aote.factory.simpleFactory;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-21 23:54
 * @Version 1.0
 **/
public class PizzaStore {

    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }

}
