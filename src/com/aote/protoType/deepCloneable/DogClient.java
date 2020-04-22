package com.aote.protoType.deepCloneable;

/**
 * @author: Weicf
 * @date: 2020-04-22 22:42
 * @description:
 */
public class DogClient {

    public static void main(String[] args) {
        Dog dog = new Dog("a",2);
        DeepCloneDog deepCloneDog = new DeepCloneDog("deep",dog);
        DeepCloneDog deep2 = (DeepCloneDog) deepCloneDog.clone();
        System.out.println(deepCloneDog.dog == deep2.dog);
    }

}
