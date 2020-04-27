package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:17
 * @description: 打开命令
 */
public class TVOnCommand implements Command {

    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.turnOn();
    }

    @Override
    public void undo() {
        tvReceiver.turnOff();
    }
}
