package com.aote.builder;

/**
 * @Description 指挥者可以有多个，处理如何建造房子的流程动态指定流程
 * @Author aote
 * @Date 2020-04-23 00:19
 * @Version 1.0
 **/
public class HouseDirector {

    // 聚合HouseBuilder，通过setter或者构造器传入
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 指挥流程
    public House constructHouse(){
        String basic = houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        House house = houseBuilder.buildHouse();
        house.setBasic(basic);
        return house;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}
