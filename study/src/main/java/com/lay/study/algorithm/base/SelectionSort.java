package com.lay.study.algorithm.base;


/**
 * 选择排序
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 4, 2, 6};
        sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void sort(int[] nums) {

        for (int i = 0; i < nums.length ; i++) {

            int min = nums[i],minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }

            swap(nums,i,minIndex);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
