package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No50 {


    public static void main(String[] args) {
        double v = myPow(2, -3);
        System.out.println(v);
    }

    public static double myPow(double x, int n) {

        if(n == 0){
            return 1;
        }

        double half = myPow(x, n/2);
        if (n%2 == 0)
        {
            return half*half;
        }
        else if (n>0)
        {
            return half*half*x;
        }
        else
        {
            return half/x*half;
        }

    }

//    private static double helper(double x, int n) {
//
//        if(n == 0){
//            return 1;
//        }
//
//        double half = helper(x, n/2);
//        if (n%2 == 0)
//        {
//            return half*half;
//        }
//        else if (n>0)
//        {
//            return half*half*x;
//        }
//        else
//        {
//            return half/x*half;
//        }
//
//    }

    public static double myPow1(double x, int n) {

        if(0d == x){
            return x;
        }


        double result = 0d;
        if(n == 0){
            return 1;
        }else if(n > 0){

            result = x;

            while (n > 1){
                result *= x;
                n--;
            }

        }else if(n < 0){

            result = x;
            while (n > 1){
                result *= x;
                n--;
            }

            result = 1/result;
        }

        return result;
    }
}
