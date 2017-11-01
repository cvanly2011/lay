package com.lay.study.algorithm.base;


/**
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 4, 2, 6};
        sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i],insertPoint = i;

            while (insertPoint > 0 && nums[insertPoint-1] > num){
                insertPoint--;
            }

            if(insertPoint != i){
                moveBaseLeft(nums,insertPoint,i);
            }
        }
    }

    private static void moveBaseLeft(int[] nums, int basePoint, int point) {

        int temp = nums[point];

        for (int i = point; i > basePoint ; i--) {
            nums[i] = nums[i-1];
        }

        nums[basePoint] = temp;

    }
}
