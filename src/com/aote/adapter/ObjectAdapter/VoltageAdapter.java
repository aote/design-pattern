package com.aote.adapter.ObjectAdapter;

/**
 * @author: Weicf
 * @date: 2020-04-23 12:32
 * @description: 对象适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    // 适配方法
    @Override
    public int output5V() {
        // 获取到220v电压
        int srcV = output220V();
        // 转成5V
        int dstV = srcV/44;
        return dstV;
    }

}
