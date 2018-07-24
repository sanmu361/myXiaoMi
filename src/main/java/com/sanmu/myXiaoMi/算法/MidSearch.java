package com.sanmu.myXiaoMi.算法;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 20:53
 **/
public class MidSearch {

    public int search(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }

    
}
