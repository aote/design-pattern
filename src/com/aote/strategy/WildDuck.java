package com.aote.strategy;

/**
 * @author: Weicf
 * @date: 2020-04-29 22:15
 * @description:
 */
public class WildDuck extends  Duck{

    // 构造器，传入FlyBehavor
    public WildDuck() {
        flyBehaviour = new GoodFly();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
