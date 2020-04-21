package com.aote.factory.factoryMethod;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-22 00:15
 * @Version 1.0
 **/
public abstract class Pizza {

    protected String name; //名字

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
