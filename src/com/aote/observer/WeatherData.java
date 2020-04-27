package com.aote.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 23:40
 * @Version 1.0
 * @Description 含有观察者集合，用ArrayList管理
 *              当数据更新，通知所有的接入方
 **/
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer))
            observerList.remove(observer);
    }

    // 通知所有观察者
    @Override
    public void notifyObservers() {
        for(Observer o:observerList){
            o.update(this.temperature,this.pressure,this.humidity);
        }
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }
}
