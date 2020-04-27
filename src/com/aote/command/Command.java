package com.aote.command;

/**
 * @author: Weicf
 * @date: 2020-04-27 14:29
 * @description: 命令接口
 */
public interface Command {

    //执行命令
    void execute();

    // 撤销命令
    void undo();

}
