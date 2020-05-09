package com.aote.source;

/**
 * @author: Weicf
 * @date: 2020-05-07 20:58
 * @description:
 */
public class ExcutorImpl implements Excutor {
    @Override
    public void test(Ani dog) {
        System.out.println(dog.getClass());
    }
}
