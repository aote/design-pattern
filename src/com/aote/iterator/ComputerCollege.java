package com.aote.iterator;

import java.util.Iterator;

/**
 * @Author aote
 * @Date 2020-04-27 22:16
 * @Version 1.0
 * @Description TODO
 **/
public class ComputerCollege implements College {

    Department[] departments;
    // 保存当前数组的对象个数
    int numOfDepartments;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java","Java");
        addDepartment("php","php");
        addDepartment("python","python");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name,String desc) {
        departments[numOfDepartments] = new Department(name,desc);
        // 表示加了一个
        numOfDepartments+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

}
