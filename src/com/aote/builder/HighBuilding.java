package com.aote.builder;

/**
 * @Description TODO
 * @Author aote
 * @Date 2020-04-23 00:18
 * @Version 1.0
 **/
public class HighBuilding extends HouseBuilder {

    @Override
    public String buildBasic() {
        System.out.println("高楼打地基");
        return "高楼打地基";
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
