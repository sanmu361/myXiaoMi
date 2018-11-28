package com.sanmu.myXiaoMi.guava;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-27 15:32
 **/
public class RangeMapTest {

    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1, 10), "aaa");
        System.out.println(rangeMap);
        System.out.println(rangeMap.get(3));
        rangeMap.put(Range.open(3, 6), "bbb");
        System.out.println(rangeMap);
        rangeMap.put(Range.openClosed(10, 20), "aaa");
        System.out.println(rangeMap);
        rangeMap.put(Range.closed(20, 20), "aaa");
        System.out.println(rangeMap);
        rangeMap.remove(Range.closed(5, 11));
        System.out.println(rangeMap);
    }
}
