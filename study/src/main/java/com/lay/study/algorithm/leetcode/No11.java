package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/10
 * @Since JDK 1.8
 */
public class No11 {

    public int maxArea(int[] height) {


        int area = 0;
        int length = height.length;
        for (int i = 0; i < length ; i++) {

            for (int j = i+1; j < length; j++) {

                int tempArea = Math.min(height[i],height[j]) * (j-i);
                if(tempArea > area){
                    area = tempArea;
                }

            }
        }
        
        return area;
    }

    public int maxArea1(int[] height) {


        int maxArea = 0;

        int length = height.length;
        int i = 0,j=length -1;

        while (i < j){
            int tempArea = Math.min(height[i],height[j]) * (j-i);
            if(tempArea > maxArea){
                maxArea = tempArea;
            }

            if(height[i] > height[j]){
                j--;
            }else {
                i++;
            }
        }


        return maxArea;
    }
}
