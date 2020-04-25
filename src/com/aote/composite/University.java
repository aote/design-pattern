package com.aote.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-25 19:35
 * @Version 1.0
 * @Description 就是Composite，可以管理College
 **/
public class University extends OrganizationComponent {

    // organizationComponentList包含College
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    // 重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponentList.add(organizationComponent);
    }

    // 重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void print() {

        // 输出大学名称
        System.out.println(getName());
        // 遍历organizationComponentList，输出University包含的学院
        for(OrganizationComponent item : organizationComponentList){
            item.print();
        }
    }

}
