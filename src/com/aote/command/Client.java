package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:16
 * @description:命令模式，将发起请求的对象与执行请求的对象解耦
 */
public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteController.onButtonPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.offButtonPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonPushed();


        // 遥控电视
        TVReceiver tvReceiver = new TVReceiver();
        Command tvOn = new TVOnCommand(tvReceiver);
        Command tvOff = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1,tvOn,tvOff);
        System.out.println("--------按下电视的开按钮-----------");
        remoteController.onButtonPushed(1);
        remoteController.undoButtonPushed();

    }

}
