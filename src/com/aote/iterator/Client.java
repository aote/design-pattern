package com.aote.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author aote
 * @Date 2020-04-27 22:33
 * @Version 1.0
 * @Description 迭代器模式
 **/
public class Client {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();
        ComputerCollege computerCollege = new ComputerCollege();
        InformationCollege informationCollege = new InformationCollege();

        collegeList.add(computerCollege);
        collegeList.add(informationCollege);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }

}
