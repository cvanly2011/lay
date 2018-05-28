package com.lay.study.algorithm.leetcode;

/**删除排序数组中的重复项
 * @author yalei.chen
 * @date 2018/4/26
 * @since JDK 1.8
 */
public class No26 {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int number = 0;

        for (int i =0;i<nums.length;i++){

            if(nums[i] != nums[number]){
                number++;
                nums[number] = nums[i];
            }
        }

        number += 1;
        return number;
    }
}
