package com.aote.adapter.interfaceAdapter;

/**
 * @Author aote
 * @Date 2020-04-23 20:12
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            // 只需要去重写我们需要使用的接口方法
            @Override
            public void m1(){
                System.out.println("使用了m1方法");
            }
        };

        abstractAdapter.m1();

    }

}
