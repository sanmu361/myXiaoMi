package com.sanmu.myXiaoMi.算法.sort;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 17:38
 **/
public class InsertSort {

    public void sort1(int[] arr){
        int perIndex, current;
        for(int i = 1; i < arr.length; i++){
            perIndex = i - 1;
            current = arr[i];

            while (perIndex >= 0 && arr[perIndex] > current ) {
                arr[perIndex + 1] = arr[perIndex];
                perIndex--;
            }
            arr[perIndex + 1] = current;
        }
    }

    public static void sort2(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j;
            for( j = i - 1; j >= 0 && temp < arr[j]; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int a[] = {2,8,2,3,5,7,0,2,1,3,7} ;

        sort2(a);
        System.out.println(a);
    }

}
