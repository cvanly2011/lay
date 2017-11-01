package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No40 {

    public static void main(String[] args) {
        No40 demo = new No40();
        List<List<Integer>> lists = demo.combinationSum2(new int[]{2,2,2}, 4);

        for (List<Integer> list : lists){

            for (Integer i : list){
                System.out.println(i);
            }
            System.out.println("---------");
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

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

            //如果当前解不在结果集中，把其加入到结果集中
            if (!exist) {
                List<Integer> list = new ArrayList<Integer>(item);
                result.add(list);
            }
            return;
        }else {


            for (int i = start;i<candidates.length;++i){

                if(i > 0 && candidates[i] == candidates[i-1]){
                    continue;
                }

                item.add(candidates[i]);
                combination(candidates,target-candidates[i],i+1,item,result);
                item.remove(item.size()-1);

            }
        }
    }
}
