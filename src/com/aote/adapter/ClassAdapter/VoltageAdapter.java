package com.aote.adapter.ClassAdapter;

/**
 * @author: Weicf
 * @date: 2020-04-23 12:32
 * @description: 类适配器类
 */
public class VoltageAdapter implements Voltage5V {

    // 聚合关系
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    // 适配方法
    @Override
    public int output5V() {

        int dst = 0;
        if(null != voltage220V){
            int src = voltage220V.output220V();
            dst = src/44;
            System.out.println("适配完成");
        }
        return dst;

    }

}
