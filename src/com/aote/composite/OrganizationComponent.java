package com.aote.composite;

/**
 * @Author aote
 * @Date 2020-04-25 19:31
 * @Version 1.0
 * @Description TODO
 **/
public abstract class OrganizationComponent {

    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 打印方法
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
