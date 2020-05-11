package com.aote.source;

/**
 * @author: Weicf
 * @date: 2020-04-24 14:20
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(14 & -817086222);

        Excutor excutor = new ExcutorImpl();
        excutor.test(new Dog());


        // 泛型测试
        Dog d = new Dog();
        Generic g = new Generic(d);
        System.out.println("泛型 - "+g.getA());

        for(int i=0;i<20;i++){
            System.out.println(("k"+i).hashCode() & (16 - 1));
        }

    }

}
