package com.aote.adapter.ObjectAdapter;


/**
 * @author: Weicf
 * @date: 2020-04-23 12:32
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        // 对象适配器模式
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

    }



}
