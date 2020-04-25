package com.aote.facade;

/**
 * @Author aote
 * @Date 2020-04-25 20:48
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }

}
