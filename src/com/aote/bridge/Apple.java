package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:03
 * @Version 1.0
 * @Description TODO
 **/
public class Apple implements Brand {
    @Override
    public void turnOn() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void turnOff() {
        System.out.println("苹果手机关机");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
