package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No34 {

    public static void main(String[] args) {
        No34 demo = new No34();
        int[] ints = demo.searchRange(new int[]{2, 2}, 3);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public int[] searchRange(int[] nums, int target) {

        int l = 0,r = nums.length-1,index = -1;

        while (l <= r && index == -1){
            int mid = (l+r+1)/2;

            if(target < nums[mid]){
                r = mid-1;
            }else if(target > nums[mid]){
                l = mid+1;
            }else {
                index = mid;
            }
        }

        int[] result = {-1, -1};

        if(index != -1){
            int left = index,right = index;

            while (left > 0 && nums[left-1] == nums[index]){
                left--;
            }

            while (right < nums.length-1 && nums[right+1] == nums[index]){
                right++;
            }

            result[0] = left;
            result[1] = right;
        }

        return result;
    }
}
