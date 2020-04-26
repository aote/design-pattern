package com.aote.template;

/**
 * @Author aote
 * @Date 2020-04-26 22:26
 * @Version 1.0
 * @Description 抽象类，表示豆浆
 **/
public abstract class SoyMilk {

    // 模板方法，模板方法可以写成final，不让子类覆盖
    final public void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    // 选材料
    void select(){
        System.out.println("选好新鲜的黄豆");
    }

    // 添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();

    // 浸泡
    void soak(){
        System.out.println("开始浸泡");
    }

    // 打磨
    void beat(){
        System.out.println("打磨豆子");
    }

    // 钩子方法，决定是否要添加配料
    boolean customerWantCondiments(){
        return true;
    }

}
