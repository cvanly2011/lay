package com.lay.study.algorithm.leetcode;

/**
 * 计算并返回 x 的平方根，其中 x 是非负整数。由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * @author yalei.chen
 * @date 2018/4/26
 * @since JDK 1.8
 */
public class No69 {

    public static int mySqrt(int x) {

        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }

        int left = 0,right = x;
        while (left < right){

            int mid = (left+right)/2;
            if(mid * mid <= x){
                left = mid+1;
            }else {
                right = mid;
            }
        }

        return right - 1;

    }

    public static void main(String[] args) {


        System.out.println(mySqrt(9));
    }


}
