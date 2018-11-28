package com.sanmu.myXiaoMi.string;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-23 18:42
 **/
public class ListTest {

    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2};

        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> indexs = new ArrayList<>();

        Arrays.sort(nums);

        find(nums,temp,indexs,result);

        return result;

    }

    private static void find(int[] nums, List<Integer> temp,List<Integer> indexs, List<List<Integer>> result){
        if(nums.length == temp.size()){
            result.add(new ArrayList<>(temp));
            return ;
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!indexs.contains(i)){
                if(set.contains(nums[i])){
                    continue;
                }
                set.add(nums[i]);
                indexs.add(i);
                temp.add(nums[i]);
                find(nums,temp,indexs,result);
                temp.remove(temp.size() - 1);
                indexs.remove(indexs.size() - 1);
            }
        }

    }

}
