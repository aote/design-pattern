package com.aote.protoType;

/**
 * @author: Weicf
 * @date: 2020-04-22 22:08
 * @description: 原型模式，克隆羊
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",3,"black");
        // 用原型模式完成对象创建
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();
        System.out.println(sheep2.toString());
        System.out.println(sheep == sheep2);
        System.out.println(sheep.equals(sheep2));
    }

}
