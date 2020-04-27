package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:09
 * @Version 1.0
 * @Description 访问者模式
 **/
public class Client {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attache(new Man());
        o.attache(new Man());
        o.attache(new Woman());

        Success success = new Success();
        o.display(success);

        Fail fail = new Fail();
        o.display(fail);

        Wait wait = new Wait();
        o.display(wait);

    }

}
