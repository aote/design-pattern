package com.aote.factory.absFactory.order;

import com.aote.factory.absFactory.Pizza;

/**
 * @author: Weicf
 * @date: 2020-05-09 13:58
 * @description: 一个抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {

    // 让工厂子类实现具体的创建方法
    public Pizza createPizza(String orderType);

}
