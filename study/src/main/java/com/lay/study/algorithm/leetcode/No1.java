package com.lay.study.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yalei.chen
 * @Date 2017/10/10
 * @Since JDK 1.8
 */
public class No1 {


    public static void main(String[] args) {
        int[] ints = myTwoSum(new int[]{1, 2, 3, 4, 5}, 6);

        for (int num: ints) {
            System.out.println(num);
        }
    }

    public static int[] myTwoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int num1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int num2 = nums[j];

                if(num1 + num2 == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }

        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
