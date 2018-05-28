package com.lay.study.nio;

/**
 * @author yalei.chen
 * @date 2018/4/17
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "he";
        String s3 = s2 + new String("llo");

        System.out.println(s1 == s3);

//        int i = 2;
//        switch (i){
//            case 1:
//                i = i+1;
//            case 2:
//                i = i+2;
//            case 3:
//                i = i+3;
//        }
//
//        System.out.println(i);
    }
}
