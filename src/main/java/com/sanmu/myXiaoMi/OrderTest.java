package com.sanmu.myXiaoMi;

import com.google.common.collect.Lists;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-12-25 16:51
 **/
public class OrderTest {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,4,5);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0 - o1.compareTo(o2);
            }
        });



        System.out.println(list.subList(0,4));

//        DateTime startDate = new DateTime(2017,12,26,0,0,0);
//
//        List<String> result = Lists.newLinkedList();
//
//        while(startDate.getMillis() >= endTime){
//            result.add(startDate.toString("yy.MM.dd"));
//            startDate = startDate.plusDays(1);
//        }
//        return result;
    }
}
