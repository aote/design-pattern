package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:17
 * @description: 发起请求的对象
 */
public class RemoteController {

    Command[] turnOnCommands;
    Command[] turnOffCommands;

    // 执行撤销命令
    Command undoCommand;

    public RemoteController() {
        turnOnCommands = new Command[5];
        turnOffCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            turnOnCommands[i] = new NonCommand();
            turnOffCommands[i] = new NonCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        turnOnCommands[no] = onCommand;
        turnOffCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonPushed(int no) { // no 0
        // 找到你按下的开的按钮， 并调用对应方法
        turnOnCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = turnOnCommands[no];
    }

    // 按下开按钮
    public void offButtonPushed(int no) { // no 0
        // 找到你按下的关的按钮， 并调用对应方法
        turnOffCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = turnOffCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonPushed() {
        undoCommand.undo();
    }

}
