package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:17
 * @description: 打开命令
 */
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }

    @Override
    public void undo() {
        lightReceiver.turnOff();
    }
}
