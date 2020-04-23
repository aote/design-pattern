package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:07
 * @Version 1.0
 * @Description 折叠样式手机继承抽象类，通过Phone调用对应品牌的方法
 **/
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void turnOn(){
        super.turnOn();
        System.out.println("折叠手机打开");
    }

    public void turnOff(){
        super.turnOff();
        System.out.println("折叠手机关闭");
    }

    public void call(){
        super.call();
        System.out.println("折叠手机打电话");
    }

}
