package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:17
 * @description: 关闭命令
 */
public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        lightReceiver.turnOff();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        lightReceiver.turnOn();
    }
}
