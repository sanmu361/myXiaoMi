package com.sanmu.myXiaoMi.OJ;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-03-15 19:32
 **/
public class RotateListMidNum {

    public static void main(String[] args) {
        System.out.println(solution1("1"));
    }

    public static String solution(String line){

        if(line !=null){
            String[] numStrs = line.split(",");
            int[] nums = new int[numStrs.length];
            for(int i = 0; i < numStrs.length; i++){
                nums[i] = Integer.parseInt(numStrs[i]);
            }
            int i = 1;
            boolean flag = false;
            for(; i < nums.length; i++){
                if(nums[i - 1] > nums[i]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                return String.valueOf(nums[(i + nums.length / 2) % nums.length]);
            }else{
                return  String.valueOf(nums[i / 2 ]);
            }
        }
        return null;
    }


    public static String solution1(String line){

        if(line !=null){
            String[] numStrs = line.split(",");
            int[] nums = new int[numStrs.length];
            for(int i = 0; i < numStrs.length; i++){
                nums[i] = Integer.parseInt(numStrs[i]);
            }

            boolean flag = false;
            int left = 0;
            int right = nums.length - 1;
            int mid = 0;
            while(left < right){
                mid = (left + right) / 2;
                if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid + 1]){
                 flag = true;
                 break;
             } else if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid-1]){
                 if(nums[mid] > nums[left]){
                     left = mid;
                 }else if(nums[mid] < nums[right]){
                     right = mid;
                 }
             }
            }
            if(flag){
                return String.valueOf(nums[(mid + nums.length / 2) % nums.length]);
            }else{
                return  String.valueOf(nums[nums.length / 2]);
            }
        }
        return null;
    }
}
