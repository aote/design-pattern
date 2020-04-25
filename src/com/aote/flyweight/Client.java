package com.aote.flyweight;

import com.sun.tools.internal.ws.resources.WebserviceapMessages;

/**
 * @Author aote
 * @Date 2020-04-25 22:37
 * @Version 1.0
 * @Description 享元模式
 **/
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        // 新闻形式的网站

        WebSite newsWebSite = factory.getWebSiteCategory("news");
        newsWebSite.use(new User(""));

        // 博客形式的网站
        WebSite blogSebSite = factory.getWebSiteCategory("blog");
        blogSebSite.use(new User(""));

    }

}
