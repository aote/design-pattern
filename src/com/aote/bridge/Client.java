package com.aote.bridge;

/**
 * @Author aote
 * @Date 2020-04-23 22:11
 * @Version 1.0
 * @Description 桥接模式（具体关系看uml图），Phone作为桥
 **/
public class Client {

    public static void main(String[] args) {
        // 获取折叠式手机
        TouchPhone phone = new TouchPhone(new Apple());
        phone.turnOn();
        phone.turnOff();
        phone.call();

        FoldedPhone phone2= new FoldedPhone(new Apple());
        phone2.turnOn();
        phone2.turnOff();
        phone2.call();


    }

}
