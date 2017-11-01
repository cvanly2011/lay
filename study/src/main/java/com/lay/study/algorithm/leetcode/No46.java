package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No46 {

    public static void main(String[] args) {
        No46 demo = new No46();
        List<List<Integer>> lists = demo.permute(new int[]{2, 1, 3});

        for (List<Integer> list : lists){

            for (Integer i : list){
                System.out.println(i);
            }
            System.out.println("---------");
        }

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(null == nums || nums.length <= 0 ){
            return result;
        }

        helper(nums,new boolean[nums.length],new ArrayList<Integer>(),result);
        return result;
    }

    private void helper(int[] nums, boolean[] used, List<Integer> item, List<List<Integer>> result) {

        if(item.size() == nums.length){
            result.add(new ArrayList<>(item));
            return;
        }

        for (int i= 0;i<nums.length;i++){

            if(!used[i]){

                used[i] = true;
                item.add(nums[i]);

                helper(nums,used,item,result);

                used[i] = false;
                item.remove(item.size() -1);
            }
        }

    }
}
