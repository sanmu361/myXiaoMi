package com.sanmu.myXiaoMi.算法.sort;

/**
 * 冒泡排序
 * 时间复杂度 O（n*n）
 *
 * @author yansen
 * @create 2018-04-26 17:22
 **/
public class BubbleSort {

    public void sort1(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sort2(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[j - 1]){
                    int temp = arr[j- 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
