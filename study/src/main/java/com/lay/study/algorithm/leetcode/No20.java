package com.lay.study.algorithm.leetcode;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No20 {


    public static void main(String[] args) {
        No20 demo = new No20();
        System.out.println(demo.isValid("([])"));
    }

    public boolean isValid(String s) {

        if(null == s || "".equals(s.trim())){
            return false;
        }

        int len = s.length(),top = -1;

        char[] chars = s.toCharArray();
        char[] stacks = new char[len];

        for (int i = 0; i < len ; i++) {

            char c = chars[i];

            if(')' == c){
                if(top >= 0 && stacks[top] == '('){
                    top--;
                }else {
                    return false;
                }
            }else if(']' == c){
                if(top >= 0 && stacks[top] == '['){
                    top--;
                }else {
                    return false;
                }
            }else if('}' == c){
                if(top >= 0 && stacks[top] == '{'){
                    top--;
                }else {
                    return false;
                }
            }else {
                stacks[++top] = c;
            }
        }

        return top == -1;

    }


    private boolean valid(int l,int r, String s) {


        if(l > s.length() -2 || r > s.length()-1){
            return false;
        }

        return true;


    }




//    private boolean valid(int index, String s) {
//
//        if(index == s.length()-1){
//            return false;
//        }
//
//        if(match(s.charAt(index),s.charAt(index+1))){
//            return true;
//        }
//
//        if(valid(index+1,s)){
//            return true;
//        }else {
//            return false;
//        }
//
//
//    }

    private boolean match(char l1, char l2) {
        switch (l1){
            case '(':
                if(')'== l2){
                    return true;
                }
                break;
            case '[':
                if(']'== l2){
                    return true;
                }
                break;
            case '{':
                if('}'== l2){
                    return true;
                }
                break;
        }

        return false;
    }




}
