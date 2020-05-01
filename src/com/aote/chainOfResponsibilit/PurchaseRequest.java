package com.aote.chainOfResponsibilit;

/**
 * @Author aote
 * @Date 2020-05-01 14:34
 * @Version 1.0
 * @Description 请求类
 **/
public class PurchaseRequest {

    private int type = 0; //请求类型
    private float price = 0.0f; //请求金额
    private int id = 0;
    //构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}
