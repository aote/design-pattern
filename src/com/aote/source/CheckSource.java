package com.aote.source;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author aote
 * @Date 2020-04-23 22:38
 * @Version 1.0
 * @Description TODO
 **/
public class CheckSource {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        for(int i=0;i<12;i++){
            map.put("k-"+i,"v-"+i);
        }

        for(int i=12;i<20;i++){
            map.put("k-"+i,"v-"+i);
        }

    }

}
