package com.aote.builder;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-23 00:18
 * @Version 1.0
 **/
public class CommonHouse extends HouseBuilder {

    @Override
    public String buildBasic() {
        System.out.println("普通房子打地基");
        return "普通房子打地基";
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
