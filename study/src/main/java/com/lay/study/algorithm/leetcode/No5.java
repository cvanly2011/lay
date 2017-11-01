package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/10
 * @Since JDK 1.8
 */
public class No5 {


    public static void main(String[] args) {


//        System.out.println("babad".substring(0,2));

        System.out.println(longestPalindrome("a"));
    }
    public static String longestPalindrome(String s) {


        String longStr = "";

        int l = s.length(),i =0,j=1;

        if(l == 1){
            return s;
        }
        while (i < l && j < l){

            if(s.charAt(j) == s.charAt(i) && s.substring(i,j).length() > longStr.length()){
                longStr = s.substring(i++,j+1);
                j=i+1;
            }else {
                j++;
            }

            if(j == l){
                i++;
                j=i+1;
            }

        }

        return longStr;
    }
}
