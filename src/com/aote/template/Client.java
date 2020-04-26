package com.aote.template;

/**
 * @Author aote
 * @Date 2020-04-26 22:30
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        // 制作红豆豆浆
        SoyMilk red = new RedBeanSoyMilk();
        red.make();

        // 制作花生豆浆
        SoyMilk peanut = new PeanutSoyMilk();
        red.make();

    }

}
