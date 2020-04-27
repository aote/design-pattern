package com.aote.iterator;

import java.util.Iterator;

/**
 * @Author aote
 * @Date 2020-04-27 22:07
 * @Version 1.0
 * @Description TODO
 **/
public class ComputerCollegeIterator implements Iterator {

    // 我们需要知道Department是以怎么样的方式存放的，这里是数组
    Department[] departments;
    // 遍历的位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departments.length ||
        departments[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
