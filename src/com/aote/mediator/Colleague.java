package com.aote.mediator;

/**
 * @Author aote
 * @Date 2020-04-28 20:42
 * @Version 1.0
 * @Description 抽象同事类
 **/
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);

}
