package com.sanmu.myXiaoMi.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-30 10:36
 **/
public class ProxyTest {

    public static void main(String[] args) {
        InvocationHandler handler = new MyInvokationHandler();

        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class},handler);

        p.walk();
    }
}
