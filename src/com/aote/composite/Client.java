package com.aote.composite;

/**
 * @Author aote
 * @Date 2020-04-25 19:45
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","世界名校");
        // 创建学院
        OrganizationComponent computerCollege = new College("计算机学院","计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院","信息工程学院");

        // 添加系
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术","老牌专业"));
        infoEngineerCollege.add(new Department("通信工程","不好学"));
        infoEngineerCollege.add(new Department("信息工程","好学"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

    }

}
