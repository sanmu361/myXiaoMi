package com.sanmu.myXiaoMi.reflections;

import com.sanmu.myXiaoMi.reflections.testPage.DelayedBaseMonitor;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-02 16:35
 **/
public class ReflectionsTest {

    public static void main(String[] args) {
        List<DelayedBaseMonitor> monitorLists = new ArrayList<DelayedBaseMonitor>();

        Reflections reflections = new Reflections("com.sanmu.myXiaoMi.reflections.testPage");

        Set<Class<? extends DelayedBaseMonitor>> monitorClasses = reflections.getSubTypesOf(DelayedBaseMonitor.class);

        for (Class<? extends DelayedBaseMonitor> monitor : monitorClasses) {

            //monitorLists.add(ApplicationContext.getBean(monitor));
            System.out.println(monitor.getClass().getName());
        }
    }
}
