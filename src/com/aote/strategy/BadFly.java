package com.aote.strategy;

/**
 * @author: Weicf
 * @date: 2020-04-29 22:04
 * @description:
 */
public class BadFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("飞行技术不行~~~");
    }

}
