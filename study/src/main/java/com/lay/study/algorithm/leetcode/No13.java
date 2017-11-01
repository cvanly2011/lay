package com.lay.study.algorithm.leetcode;

import java.util.*;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/10
 * @Since JDK 1.8
 */
public class No13 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        Arrays.sort(nums);

        for (int num:nums) {
            numSet.add(num);
        }

        for (int i = 0; i < nums.length ; i++) {

            for (int j = i+1; j < nums.length ; j++) {

                int needNum = 0 - nums[i] - nums[j];

                if(numSet.contains(needNum)){

                    List<Integer> r = new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(needNum);
                    result.add(r);
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {

        threeSum1(new int[]{7,-3,2,0,0,2,4,-4});


        for (List<Integer> r:ret) {

            for (Integer i:r) {
                System.out.println(i);
            }

            System.out.println("=============");
        }

        System.out.println("end");
    }

    static List<List<Integer>> ret = new ArrayList<>();

    public static List<List<Integer>> threeSum1(int[] nums) {

        if (nums == null || nums.length < 3) return ret;

        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            find(nums, i+1, len-1, nums[i]); //寻找两个数与num[i]的和为0
        }

        return ret;
    }

    private static void find(int[] nums, int l, int r, int num) {

        while (l < r){

            if(nums[l] + nums[r] + num == 0){
                List<Integer> result = new ArrayList<>();
                result.add(num);
                result.add(nums[l]);
                result.add(nums[r]);
                ret.add(result);

                while (l < r && nums[l] == nums[l+1]){
                    l++;
                }

                while (l < r && nums[r] == nums[r-1]){
                    r--;
                }

                l++;
                r--;

            }else if(nums[l] + nums[r] + num < 0){

                l++;
            }else {
                r--;
            }
        }
    }


}
