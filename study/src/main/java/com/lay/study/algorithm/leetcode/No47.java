package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No47 {

    public static void main(String[] args) {
        No47 demo = new No47();
        List<List<Integer>> lists = demo.permuteUnique(new int[]{1, 1, 2});

        for (List<Integer> list : lists){

            for (Integer i : list){
                System.out.println(i);
            }
            System.out.println("---------");
        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(null == nums || nums.length <= 0 ){
            return result;
        }

        Arrays.sort(nums);

        helper(nums,new boolean[nums.length],new ArrayList<Integer>(),result);
        return result;
    }

    private void helper(int[] nums, boolean[] used, List<Integer> item, List<List<Integer>> result) {

        if(item.size() == nums.length){

            boolean exist = false;
            for (int i = result.size() - 1; i >= 0 ; i--) {
                List<Integer> tmp = result.get(i);
                if (tmp.size() != item.size()) {
                    continue;
                }
                int j = 0;
                while (j < item.size() && tmp.get(j) == item.get(j)) {
                    j++;
                }
                if (j == item.size()) {
                    exist = true;
                    break;
                }
            }

            if(!exist){
                result.add(new ArrayList<>(item));
            }
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
