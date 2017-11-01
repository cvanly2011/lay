package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No39 {

    public static void main(String[] args) {
        No39 demo = new No39();
        List<List<Integer>> lists = demo.combinationSum(new int[]{2, 3, 6, 7}, 7);

        for (List<Integer> list : lists){

            for (Integer i : list){
                System.out.println(i);
            }
            System.out.println("---------");
        }
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if(null == candidates || candidates.length <= 0){
            return result;
        }

        List<Integer> item = new ArrayList<>();
        Arrays.sort(candidates);

        combination(candidates,target,0,item,result);

        return result;

    }

    private void combination(int[] candidates, int target, int start, List<Integer> item, List<List<Integer>> result) {

        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new ArrayList<>(item));
            return;
        }else {

            for (int i = start;i<candidates.length;++i){

                if(i > 0 && candidates[i] == candidates[i-1]){
                    continue;
                }

                item.add(candidates[i]);
                combination(candidates,target-candidates[i],i,item,result);
                item.remove(item.size()-1);

            }
        }
    }

}


