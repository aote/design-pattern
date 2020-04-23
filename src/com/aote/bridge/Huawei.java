package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:04
 * @Version 1.0
 * @Description TODO
 **/
public class Huawei implements Brand {
    @Override
    public void turnOn() {
        System.out.println("华为手机开机");
    }

    @Override
    public void turnOff() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
