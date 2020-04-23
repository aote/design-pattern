package com.aote.decorator;

/**
 * @Author aote
 * @Date 2020-04-24 00:10
 * @Version 1.0
 * @Description 装饰器
 **/
public class Decorator extends Drink {

    // 被装饰的对象(可以理解它的子类被装饰？)
    private Drink obj;

    // 组合关系
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice先拿到自己调料的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // 输出被装饰者信息
        return obj.getDes() +" & "+ des +" price+"+getPrice();
    }
}
