package com.aote.mediator;

/**
 * @Author aote
 * @Date 2020-04-28 20:42
 * @Version 1.0
 * @Description TODO
 **/
public abstract class Mediator {

    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();

}
