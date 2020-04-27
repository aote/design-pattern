package com.aote.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 22:25
 * @Version 1.0
 * @Description TODO
 **/
public class OutPutImpl {

    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，调用printDepartment输出各个学院的系
    public void printCollege(){
        // 从collegeList中取出所有学院，这里用的是java中的Iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 取出一个学院
            College college = iterator.next();
            System.out.println("学院名称："+college.getName());
            // 取出学院对应的迭代器
            printDepartment(college.createIterator());
        }
    }

    // 输出学院 输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }

}
