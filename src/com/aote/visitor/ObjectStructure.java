package com.aote.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 21:16
 * @Version 1.0
 * @Description 数据结构，管理了很多的人
 **/
public class ObjectStructure {

    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    public void attache(Person person){
        persons.add(person);
    }

    public void detach(Person person){
        persons.remove(person);
    }

    // 显示评测情况
    public void display(Action action){
        for(Person p : persons){
            p.accept(action);
        }
    }

}
