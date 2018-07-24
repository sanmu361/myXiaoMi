package com.sanmu.myXiaoMi.OJ;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-03-14 20:17
 **/
public class TheLongestList {

    public static void main(String[] args) {
        System.out.println(solution("54,55,300,12,56"));
    }

    public static String solution(String line){
        int maxlen = 0;
        String[] nums = line.split(",");
        Set<Integer> set = new HashSet<Integer>();

        for(String n : nums){
            set.add(Integer.parseInt(n));
        }

        for(String n : nums){
            int num = Integer.parseInt(n);
            int curr = num, len = 0;

            while(set.contains(curr)){
                curr++;
                len++;
            }

            curr = num - 1;
            while(set.contains(curr)){
                curr--;
                len++;
            }
            maxlen = Math.max(len, maxlen);
        }
        return String.valueOf(maxlen);
    }

    public String solution1(String line){
        System.out.println("1");
        return null;
    }
}
