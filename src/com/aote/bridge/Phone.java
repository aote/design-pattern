package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:04
 * @Version 1.0
 * @Description 桥接模式中的桥
 **/
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void turnOn(){
        this.brand.turnOn();
    }

    protected void turnOff(){
        this.brand.turnOff();
    }

    protected void call(){
        this.brand.call();
    }

}
