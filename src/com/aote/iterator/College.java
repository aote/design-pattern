package com.aote.iterator;

import java.util.Iterator;

/**
 * @Author aote
 * @Date 2020-04-27 22:15
 * @Version 1.0
 * @Description TODO
 **/
public interface College {

    public String getName();

    public void addDepartment(String name,String desc);

    // 返回迭代器
    public Iterator createIterator();



}
