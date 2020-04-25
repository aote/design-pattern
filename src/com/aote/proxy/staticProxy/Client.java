package com.aote.proxy.staticProxy;

/**
 * @Author aote
 * @Date 2020-04-25 23:24
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoProxy(new TeacherDao());
        teacherDao.teach();
    }

}
