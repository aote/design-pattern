package com.aote.iterator;

/**
 * @Author aote
 * @Date 2020-04-27 22:06
 * @Version 1.0
 * @Description TODO
 **/
public class Department {


    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
