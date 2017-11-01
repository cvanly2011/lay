package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class No60 {

    public static void main(String[] args) {

        System.out.println(getPermutation(9,94626));
    }

    public static String getPermutation(int n, int k) {

        List<String> all = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i] = i+1;
        }

        helper(nums,new boolean[nums.length],all,"");

        if(k <= all.size()){
            return all.get(k-1);
        }else {
            return null;
        }
    }

    private static void helper(int[] nums,boolean[] used, List<String> all, String item) {

        if(item.length() == nums.length){
            all.add(new String(item));
            return;
        }

        for (int i = 0; i < nums.length;i++){

            if(!used[i]){
                item = item+nums[i];
                used[i] = true;
                helper(nums,used,all,item);
                used[i] = false;
                item = item.substring(0,item.length() -1);
            }
        }
    }
}
