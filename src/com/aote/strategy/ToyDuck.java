package com.aote.strategy;

/**
 * @author: Weicf
 * @date: 2020-04-29 22:05
 * @description:
 */
public class ToyDuck extends Duck {

    // 构造器，传入FlyBehavor
    public ToyDuck() {
        flyBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }
}
