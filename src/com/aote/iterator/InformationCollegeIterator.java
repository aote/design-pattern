package com.aote.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 22:11
 * @Version 1.0
 * @Description TODO
 **/
public class InformationCollegeIterator implements Iterator {

    List<Department> departmentList;
    // 索引
    int index = -1;

    public InformationCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断list中还有没有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index>=departmentList.size()-1){
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
