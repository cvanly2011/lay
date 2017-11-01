package com.lay.study.algorithm.base;


/**
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 4, 2, 6};
        sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void sort(int[] nums) {

        int gap = nums.length / 2;

        while (gap != 0){

            for (int i = 0; i < gap ; i++) {

                for (int j = i+gap; j < nums.length; j+=gap) {

                    int num = nums[j],insertPoint = j;

                    while (insertPoint >= gap && nums[insertPoint-gap] > num){
                        insertPoint = insertPoint-gap;
                    }

                    if(insertPoint != j){
                        moveBaseLeft(nums,insertPoint,j,gap);
                    }
                }
            }

            gap /= 2;

        }

    }

    private static void moveBaseLeft(int[] nums, int basePoint, int point,int gap) {

        int temp = nums[point];

        for (int i = point; i > basePoint ; i -= gap) {
            nums[i] = nums[i-gap];
        }

        nums[basePoint] = temp;

    }
}
