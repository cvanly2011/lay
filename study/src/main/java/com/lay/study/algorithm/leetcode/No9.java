package com.lay.study.algorithm.leetcode;

/**
 * 回文数
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 进阶: 你能不将整数转为字符串来解决这个问题吗？

 * @author yalei.chen
 * @date 2018/4/27
 * @since JDK 1.8
 */
public class No9 {


    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int tem = x,result = 0;


        while (tem>0){

            int mod = tem % 10;
            if(result > Integer.MAX_VALUE / 10){
                return false;
            }else {
                result = 10 * result + mod;
            }

            tem /= 10;
        }

        return x == result;
    }

    public static boolean isPalindrome1(int x) {

        if(x < 0){
            return false;
        }

        String str = x+"";

        char[] chars = str.toCharArray();

        boolean result = true;
        for (int i = 0;i<chars.length;i++){

            if(chars[i] != chars[chars.length-1-i]){
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome1(1211));
    }

}
