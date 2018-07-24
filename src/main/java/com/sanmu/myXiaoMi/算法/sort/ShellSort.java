package com.sanmu.myXiaoMi.算法.sort;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 18:13
 **/
public class ShellSort {

    public void sort1(int[] data){
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
        }
    }
}
