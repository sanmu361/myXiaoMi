package com.sanmu.myXiaoMi.reflect;

import java.lang.reflect.Field;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 13:39
 **/
public class StringSwapValue1 {

    public static void main(String[] args) {
        String a = "111111111";
        String b = "222222222";

        swap(a,b);

        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(String a,String b){
        try {
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            Object f1 = field.get(a);
            Object f2 = field.get(b);

            field.set(a,f2);
            field.set(b,f1);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
