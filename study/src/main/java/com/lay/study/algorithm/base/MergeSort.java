package com.lay.study.algorithm.base;

/**
 * 归并排序
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] nums = {7, 6, 2, 1, 4, 5, 9};

        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void sort(int[] nums){
        helper(nums,0,nums.length-1,new int[nums.length]);
    }

    private static void helper(int[] nums, int l, int r, int[] temp) {

        if(l >= r){
            return;
        }

        int mid = l + (r - l) / 2;

        helper(nums,l,mid,temp);
        helper(nums,mid+1,r,temp);

        merge(nums,l,mid,r,temp);
    }

    private static void merge(int[] nums, int l, int mid, int r, int[] temp) {

        int i = l, j = mid + 1;

        int t = 0;//临时数组指针

        while (i<=mid && j<=r){
            if(nums[i]<=nums[j]){
                temp[t++] = nums[i++];
            }else {
                temp[t++] = nums[j++];
            }
        }

        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = nums[i++];
        }
        while(j<=r){//将右序列剩余元素填充进temp中
            temp[t++] = nums[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(l <= r){
            nums[l++] = temp[t++];
        }

    }

}
