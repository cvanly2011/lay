package com.lay.study.algorithm.base;



/**
 * 冒泡排序
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 4, 2, 6};
        sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void sort(int[] nums) {

        for (int i = nums.length-1; i >= 0; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                if(nums[j] > nums[i]){
                    swap(nums,i,j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
