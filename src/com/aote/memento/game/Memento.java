package com.aote.memento.game;

/**
 * @author: Weicf
 * @date: 2020-04-29 10:15
 * @description:
 */
public class Memento {

    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(int vit, int def) {
        super();
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

}
