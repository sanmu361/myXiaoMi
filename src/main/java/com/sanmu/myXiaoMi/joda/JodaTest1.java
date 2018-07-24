package com.sanmu.myXiaoMi.joda;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.joda.time.DateTime;

import java.util.Collection;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-11-20 21:03
 **/
public class JodaTest1 {

    public static void main(String[] args) {
//        DateTime dateTime=new DateTime(2017, 10, 31, 0, 0,0);
//
//        String a = dateTime.toString("yyyyMMdd");
//        long now = new Date().getTime();
//
//        while(now > dateTime.getMillis()){
//            dateTime = dateTime.plusDays(1);
//            a += "," + dateTime.toString("yyyyMMdd");
//        }
//
//        System.out.println(a);

        Multimap<String, String> myMultimap = ArrayListMultimap.create();

        // 添加键值对
        myMultimap.put("Fruits", "Bannana");
        //给Fruits元素添加另一个元素
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        // 获得multimap的size
        int size = myMultimap.size();
        System.out.println(size);  // 4

//        // 获得Fruits对应的所有的值
//        Collection<String> fruits = myMultimap.get("Fruits");
//        System.out.println(fruits); // [Bannana, Apple, Pear]
//
//        Collection<String> vegetables = myMultimap.get("Vegetables");
//        System.out.println(vegetables); // [Carrot]

        //遍历Mutlimap
        for(String key : myMultimap.keys()) {
            System.out.println(key + ": " + myMultimap.get(key));
        }

//        // Removing a single value
//        myMultimap.remove("Fruits","Pear");
//        System.out.println(myMultimap.get("Fruits")); // [Bannana, Pear]
//
//        // Remove all values for a key
//        myMultimap.removeAll("Fruits");
//        System.out.println(myMultimap.get("Fruits")); // [] (Empty Collection!)
    }
}
