package com.aote.decorator;

/**
 * @Author aote
 * @Date 2020-04-24 00:04
 * @Version 1.0
 * @Description 抽象类，其中方法由子类实现
 **/
public abstract class Drink {

    public String des;
    private float price = 0.0f;

    // 子类实现
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
