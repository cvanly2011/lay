package com.lay.study.algorithm.base;

/**
 * 快速排序
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class QuickSort {


    public static void main(String[] args) {

        QuickSort sort = new QuickSort();
        int[] nums = {3, 7, 1, 4, 2, 6};
        sort.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    public void sort(int[] nums){
        helper(nums,0,nums.length-1);
    }

    private void helper(int[] nums, int l, int r) {

        if(l >= r){
            return;
        }

        int base = nums[l],index=l;

        for (int i = l+1; i <= r; i++) {

            if(nums[i] < base){
                moveBaseLeft(nums,index,i);
                index++;
            }
        }

        helper(nums,l,index);
        helper(nums,index+1,r);
    }

    private void moveBaseLeft(int[] nums, int basePoint, int point) {

        int temp = nums[point];

        for (int i = point; i > basePoint ; i--) {
            nums[i] = nums[i-1];
        }

        nums[basePoint] = temp;

    }


}
