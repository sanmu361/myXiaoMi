package com.sanmu.myXiaoMi.guava;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-06-20 10:59
 **/
public class RegionMap {

    public static void main(String[] args) {
        testRangeMap();
    }

    private static RangeMap<Integer, String> testRangeMap() {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1, 10), "aaa");
        System.out.println(rangeMap);
        rangeMap.put(Range.open(3, 6), "bbb");
        System.out.println(rangeMap);
        rangeMap.put(Range.openClosed(10, 20), "aaa");
        System.out.println(rangeMap);
        rangeMap.put(Range.closed(20, 20), "aaa");
        System.out.println(rangeMap);
        rangeMap.remove(Range.closed(5, 11));
        System.out.println(rangeMap);

        return   rangeMap;
    }
}
