package com.aote.factory.factoryMethod;


import com.aote.factory.factoryMethod.order.BJOrderPizza;

/**
 * @Author aote
 * @Date 2020-04-22 00:27
 * @Version 1.0
 * @Description 方法工厂模式
 **/
public class Client {

    public static void main(String[] args) {
        // 创建北京口味的披萨
        new BJOrderPizza();
    }

}
