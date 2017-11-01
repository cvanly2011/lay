package com.lay.study.algorithm.leetcode;

import java.util.Arrays;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No16 {


    public static void main(String[] args) {

        System.out.println(threeSumClosest(new int[]{0,1,2},0));
    }

    public static int threeSumClosest(int[] nums, int target) {

        int result = 0,closest = Integer.MAX_VALUE;

        if(null == nums || nums.length < 3){
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2 ; i++) {

            int num = nums[i];
            int l = i+1,r = nums.length -1;

            while (l < r){

                int sum = num + nums[l] + nums[r];

                if(sum < target){

                    if(target - sum < closest){
                        closest = target - sum;
                        result = sum;
                    }
                    l++;

                }else if(sum > target){
                    if(sum - target < closest){
                        closest =sum - target;
                        result = sum;
                    }
                    r--;
                }else {
                    return target;
                }

            }
        }


        return result;
    }
}
