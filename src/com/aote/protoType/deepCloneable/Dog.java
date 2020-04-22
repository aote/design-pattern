package com.aote.protoType.deepCloneable;

import java.io.*;

/**
 * @author: Weicf
 * @date: 2020-04-22 22:26
 * @description:
 */
public class Dog implements Serializable,Cloneable {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 使用Cloneable实现深拷贝
    @Override
    protected Object clone() {
        Dog dog = null;
        try {
            dog = (Dog)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return dog;
    }

    /**
     * 使用Serializable实现深拷贝(推荐)
     * 以对象的方式输出，再以对象的方式读回来
     * @return
     */
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前对象已对象流的方式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Dog cloneDog = (Dog)ois.readObject();
            return cloneDog;
        } catch (Exception e){
            return null;
        } finally {
            try {
                oos.close();
                bos.close();
                ois.close();
                bis.close();
            } catch (Exception e){

            }
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
