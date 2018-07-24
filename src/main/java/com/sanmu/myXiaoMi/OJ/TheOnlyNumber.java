package com.sanmu.myXiaoMi.OJ;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-03-12 11:12
 **/
public class TheOnlyNumber {

    public static void main(String[] args) {
        System.out.println(solution("10 10 11 12 12 11 16"));

    }

    private static String solution(String line){
        if(line != null && line.length() > 0){
            String[] list = line.split(" ");

            int result = -1;
            if(list.length > 0){
                result = Integer.parseInt(list[0]);
            }
            for(int i = 1; i < list.length; i++){
                Integer integer = Integer.parseInt(list[i]);
                result ^= integer;
            }
            return String.valueOf(result);
        }
        return null;
    }
}
