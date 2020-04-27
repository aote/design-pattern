package com.aote.observer;

/**
 * @Author aote
 * @Date 2020-04-27 23:37
 * @Version 1.0
 * @Description TODO
 **/
public class CurrentConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    public void display(){
        System.out.println("主站温度："+temperature);
        System.out.println("主站压强："+pressure);
        System.out.println("主站湿度："+humidity);
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

}
