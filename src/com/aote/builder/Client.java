package com.aote.builder;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-23 00:19
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子，返回产品(房子)
        House house = houseDirector.constructHouse();

    }

}
