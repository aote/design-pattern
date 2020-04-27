package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:17
 * @description: 关闭命令
 */
public class TVOffCommand implements Command {

    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tvReceiver.turnOff();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tvReceiver.turnOn();
    }
}
