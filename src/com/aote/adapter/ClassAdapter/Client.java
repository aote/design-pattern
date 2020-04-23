package com.aote.adapter.ClassAdapter;

/**
 * @author: Weicf
 * @date: 2020-04-23 12:32
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        // 对象适配器模式，由继承变成了聚合
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter(voltage220V);
        phone.charging(voltageAdapter);
    }



}
