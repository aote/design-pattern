package com.aote.template;

/**
 * @Author aote
 * @Date 2020-04-26 22:43
 * @Version 1.0
 * @Description TODO
 **/
public class PureSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
