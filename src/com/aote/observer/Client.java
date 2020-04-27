package com.aote.observer;

/**
 * @Author aote
 * @Date 2020-04-27 23:34
 * @Version 1.0
 * @Description 观察者模式
 **/
public class Client {

    public static void main(String[] args) {
        // 创建weatherData
        WeatherData weatherData = new WeatherData();
        // 创建观察者，如果有新的类型的观察者，只要注册进registerObserver就可以了
        CurrentConditions c = new CurrentConditions();
        // 注册到weatherData
        weatherData.registerObserver(c);

        System.out.println("通知注册的观察者");
        weatherData.setData(12f,100f,30.3f);
    }

}
