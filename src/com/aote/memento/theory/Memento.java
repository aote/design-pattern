package com.aote.memento.theory;

/**
 * @author: Weicf
 * @date: 2020-04-29 11:44
 * @description:
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
