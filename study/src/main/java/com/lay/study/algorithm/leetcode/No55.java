package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No55 {

    public static void main(String[] args) {

        boolean b = canJump(new int[]{0});

        System.out.println(b);
    }

    public static boolean canJump(int[] nums) {

        int index = 0;

        while (index < nums.length){


            int step = nums[index];
            if(step == 0){
                if(index == nums.length-1){
                    return true;
                }
                return false;
            }
            index += step;
        }

        return true;
    }
}
