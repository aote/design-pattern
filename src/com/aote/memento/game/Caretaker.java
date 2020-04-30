package com.aote.memento.game;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author: Weicf
 * @date: 2020-04-29 10:15
 * @description: 守护者对象, 保存游戏角色的状态
 */
public class Caretaker {

    // 如果只保存一次
    private Memento memento;

    // 保存多次，可以用List
    private ArrayList<Memento> mementos;

    // 保存多个角色多个状态，可以用Map

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }

}
