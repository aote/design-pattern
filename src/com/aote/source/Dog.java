package com.aote.source;

/**
 * @author: Weicf
 * @date: 2020-04-23 11:53
 * @description:
 */
public class Dog extends Ani {

    @Override
    public void run(){
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.toString());
        d.run();
    }

}
