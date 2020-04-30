package com.aote.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Weicf
 * @date: 2020-04-29 11:44
 * @description:
 */
public class Caretaker {

    //在List 集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第index个Originator 的 备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }

}
