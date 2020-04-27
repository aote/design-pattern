package com.aote.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 22:11
 * @Version 1.0
 * @Description TODO
 **/
public class InformationCollege implements College {

    List<Department> departmentList;


    public InformationCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name,String desc) {
        departmentList.add(new Department(name,desc));
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departmentList);
    }
}
