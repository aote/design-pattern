package com.aote.memento.game;

/**
 * @author: Weicf
 * @date: 2020-04-29 10:14
 * @description: 备忘录模式
 */
public class Client {

    public static void main(String[] args) {
        //创建游戏角色
        Hero gameRole = new Hero();
        gameRole.setVit(100);
        gameRole.setDef(100);

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }

}
