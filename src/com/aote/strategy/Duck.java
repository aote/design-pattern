package com.aote.strategy;

/**
 * @author: Weicf
 * @date: 2020-04-29 22:05
 * @description:
 */
public abstract class Duck {

    // 聚合策略接口
    FlyBehaviour flyBehaviour;
    // 可以增加其他策略接口

    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void fly(){
        if(flyBehaviour != null) {
             flyBehaviour.fly();
        }
    }

}
