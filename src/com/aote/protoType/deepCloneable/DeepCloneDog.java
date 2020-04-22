package com.aote.protoType.deepCloneable;


import java.io.Serializable;

/**
 * @author: Weicf
 * @date: 2020-04-22 22:29
 * @description: DeepCloneDog中的Dog是深拷贝
 */
public class DeepCloneDog implements Serializable,Cloneable {

     String name;
     Dog dog;

    @Override
    protected Object clone() {
        Object deep = null;
        DeepCloneDog deepCloneDog = null;
        try {
            // 对基本数据类型和Stirng的克隆
            deep = super.clone();
            // 对引用类型的属性进行单独处理
            deepCloneDog = (DeepCloneDog) deep;
            deepCloneDog.dog = (Dog) dog.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return deepCloneDog;
    }

    public DeepCloneDog(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "DeepCloneDog{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
