package com.aote.strategy;

/**
 * @author: Weicf
 * @date: 2020-04-29 21:56
 * @description: 策略模式
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new ToyDuck();
        duck.fly();
    }

}
