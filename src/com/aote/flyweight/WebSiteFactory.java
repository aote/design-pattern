package com.aote.flyweight;

import java.util.HashMap;

/**
 * @Author aote
 * @Date 2020-04-25 22:41
 * @Version 1.0
 * @Description 网站工厂类，根据需求返回一个网站
 **/
public class WebSiteFactory {

    // 充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站，如果没有就创建一个，返回到池中
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            // 没有就创建
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类总数(池中有多少种类网站)
    public int getWebSite(){
        return pool.size();
    }

}
