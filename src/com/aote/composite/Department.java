package com.aote.composite;

/**
 * @Author aote
 * @Date 2020-04-25 19:43
 * @Version 1.0
 * @Description 系，在这里表示叶子节点
 **/
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    public String getName(){
        return super.getName();
    }

    public String getDes(){
        return super.getDes();
    }

    @Override
    protected void print() {

    }


}
