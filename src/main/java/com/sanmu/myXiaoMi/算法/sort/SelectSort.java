package com.sanmu.myXiaoMi.算法.sort;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 17:30
 **/
public class SelectSort {

    public void sort1(int[] arr){

        int mixIndex,temp;

        for(int i = 0 ; i < arr.length - 1; i++){
            mixIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[mixIndex] > arr[j]){
                    mixIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[mixIndex];
            arr[mixIndex] = temp;
        }

    }

    public void sort2(int[] arr){

    }

}
