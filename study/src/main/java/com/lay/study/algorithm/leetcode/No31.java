package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No31 {

    public static void main(String[] args) {
        No31 demo = new No31();
        int[] nums = {1, 2};
        demo.nextPermutation(nums);

        for (int i:nums) {
            System.out.println(i);
        }
    }

    public void nextPermutation(int[] nums) {

        int i = nums.length -2;

        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0){

            int j = nums.length -1;
            while (j > 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }

        reverse(nums,i+1);

    }

    private void reverse(int[] nums, int start) {

        int i = start,j = nums.length -1;
        while (i < j){
            swap(nums,i++,j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
