package com.aote.builder;

/**
 * @Description 抽象的建造者
 * @Author aote
 * @Date 2020-04-23 00:18
 * @Version 1.0
 **/
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 用抽象方法定义建造流程
     */
    public abstract String buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    // 建造房子，将产品(房子)返回
    public House buildHouse(){
        return house;
    }

}
