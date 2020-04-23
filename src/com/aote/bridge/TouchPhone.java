package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:21
 * @Version 1.0
 * @Description 增加一种新类型的手机，只要继承Phone就可以
 **/
public class TouchPhone extends Phone {

    public TouchPhone(Brand brand) {
        super(brand);
    }

    public void turnOn(){
        super.turnOn();
        System.out.println("触屏手机打开");
    }

    public void turnOff(){
        super.turnOff();
        System.out.println("触屏手机关闭");
    }

    public void call(){
        super.call();
        System.out.println("触屏手机打电话");
    }

}
