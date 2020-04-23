package com.aote.adapter.ObjectAdapter;

/**
 * @author: Weicf
 * @date: 2020-04-23 12:32
 * @description:
 */
public class Phone {

    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压5v，开始充电");
        } else {
            System.out.println("电压过高，无法充电");
        }
    }

}
