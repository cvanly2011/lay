package com.lay.study.algorithm.leetcode;

import java.util.*;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No18 {

    public static void main(String[] args) {
        List<List<Integer>> lists = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        for (List<Integer> r:lists) {

            for (Integer i:r) {
                System.out.println(i);
            }

            System.out.println("=============");
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {

//        List<List<Integer>> result = new ArrayList<>();

        Set<List<Integer>> result = new HashSet<>();

        if(null == nums || nums.length < 4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        int length = nums.length;
        for (int i = 0; i < length-3; i++) {

            for (int j = i+1; j < length-2; j++) {

                int l = j+1,r = length -1;

                while (l < r){

                    if(nums[i] + nums[j] + nums[l] + nums[r] == target) {
                        List<Integer> ret = new ArrayList<>();
                        ret.add(nums[i]);
                        ret.add(nums[j]);
                        ret.add(nums[l]);
                        ret.add(nums[r]);
                        result.add(ret);
                        l++;
                        r--;

                    }else if(nums[l] + nums[r] + nums[i] + nums[j] < target){
                        l++;
                    }else {
                        r--;
                    }
                }


            }
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (List<Integer> set : result){

            ret.add(set);
        }

        return ret;
    }
}
