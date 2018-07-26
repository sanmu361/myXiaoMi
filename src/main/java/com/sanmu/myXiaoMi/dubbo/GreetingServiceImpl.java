package com.sanmu.myXiaoMi.dubbo;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-26 12:31
 **/
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
