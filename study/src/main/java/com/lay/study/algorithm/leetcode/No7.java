package com.lay.study.algorithm.leetcode;

/**
 * 反转整数
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
 示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 * @author yalei.chen
 * @date 2018/4/27
 * @since JDK 1.8
 */
public class No7 {

    public static int reverse(int x) {

        boolean biggerThan0 = x >=  0 ? true : false;

        int tem = Math.abs(x),result = 0;


        while (tem>0){

            int mod = tem % 10;
            if(result > Integer.MAX_VALUE / 10){
                return 0;
            }else {
                result = 10 * result + mod;
            }

            tem /= 10;
        }

        return biggerThan0 ? result : -1 * result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
