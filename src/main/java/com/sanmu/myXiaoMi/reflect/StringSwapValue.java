package com.sanmu.myXiaoMi.reflect;

import java.lang.reflect.Field;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-07-31 19:16
 **/
public class StringSwapValue {

    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        String a = "aaaaaa";
        String b = "bbbbbb";

        Field value = String.class.getDeclaredField("value");

        value.setAccessible(true);

        Object temp = value.get(a);

        value.set(a,value.get(b));

        value.set(b,temp);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
