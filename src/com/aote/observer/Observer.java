package com.aote.observer;

/**
 * @Author aote
 * @Date 2020-04-27 23:35
 * @Version 1.0
 * @Description 观察者接口，由观察者实现
 **/
public interface Observer {

    public void update(float temperature,float pressure ,float humidity);

}
