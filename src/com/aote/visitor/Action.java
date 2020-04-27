package com.aote.visitor;

/**
 * @Author aote
 * @Date 2020-04-27 21:06
 * @Version 1.0
 * @Description 访问者，访问Man
 **/
public abstract class Action {

    // 得到男性的测评结果
    public abstract void getManResult(Man man);

    // 女性结果
    public abstract void getWomanResult(Woman man);

}
