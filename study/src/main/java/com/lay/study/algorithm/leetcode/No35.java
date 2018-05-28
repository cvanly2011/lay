package com.lay.study.algorithm.leetcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素
 * @author yalei.chen
 * @date 2018/4/26
 * @since JDK 1.8
 */
public class No35 {

    public static  int searchInsert(int[] nums, int target) {


        if(target <= nums[0]){
            return 0;
        }else if(target > nums[nums.length-1]){
            return nums.length;
        }

        int low = 0,hi = nums.length -1;
        int mid;

        while (low <= hi){

            mid = (low + hi) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                hi = mid -1;

            }else {
                low = mid + 1;
            }
        }

        return low;



    }

    public static void main(String[] args) {

//        searchInsert(new int[]{1,3},2);

        System.out.println(find(new int[]{1,2,3,5,8,10},2,0,5));
    }

    public static int find(int[] nums, int target, int left, int right) {

        if(right < left){
            return -1;
        }

        int mid = (left + right)/2;

        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
            return find(nums,target,mid+1,right);
        }else {
            return find(nums,target,left,mid-1);
        }

    }



}
