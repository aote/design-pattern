package com.aote.flyweight;

/**
 * @Author aote
 * @Date 2020-04-25 22:39
 * @Version 1.0
 * @Description 具体的网站
 **/
public class ConcreteWebSite extends WebSite {

    // 网站的类型
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("website type is "+type);
    }

}
