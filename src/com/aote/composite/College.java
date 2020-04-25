package com.aote.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-25 19:41
 * @Version 1.0
 * @Description TODO
 **/
public class College extends OrganizationComponent {

    // List中存放的是department
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    // 重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent){
        // 实际业务中这里的add方法和University中的不同
        organizationComponentList.add(organizationComponent);
    }

    // 重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("===================");
        System.out.println("学院："+getName());
        for(OrganizationComponent item : organizationComponentList){
            System.out.println("系："+item.getName());
        }
    }

}
