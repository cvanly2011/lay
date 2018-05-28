package com.lay.study.algorithm.leetcode;

/**
 * 实现strStr()
 * @author yalei.chen
 * @date 2018/4/27
 * @since JDK 1.8
 */
public class No28 {

    public static int strStr(String haystack, String needle) {

        if(haystack.equals(needle)){
            return 0;
        }

        char[] hChars = haystack.toCharArray();
        char[] nChars = needle.toCharArray();

        for (int i = 0;i <= hChars.length-nChars.length;i++){

            boolean containNeedle = true;
            for (int j = 0;j < nChars.length;j++){

                if(hChars[i+j] != nChars[j]){
                    containNeedle = false;
                    break;
                }
            }

            if(containNeedle){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(strStr("mississippi","a"));
    }
}
