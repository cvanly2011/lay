package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/10
 * @Since JDK 1.8
 */
public class No8 {


    public static void main(String[] args) {

        int i = myAtoi("   010");
        System.out.println(i);
    }


    public static int myAtoi(String str) {


        if(null == str || str.length() == 0){
            return 0;
        }

        str = str.trim();
        boolean positive = true;

        int i = 0;
        if(str.charAt(0) == '+'){
            positive = true;
            i++;
        }else if(str.charAt(0) == '-'){
            positive = false;
            i++;
        }

        double result = 0;
        for (; i < str.length(); i++) {

            int num = str.charAt(i) - '0';

            if(num < 0 || num > 9){
                break;
            }

            if(positive){
                result = result * 10 + num;
                if (result > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }else {
                result = result * 10 -num;
                if(result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }

        }

        return (int) result;
    }
}
