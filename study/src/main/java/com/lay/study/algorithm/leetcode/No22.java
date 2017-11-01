package com.lay.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/10/11
 * @Since JDK 1.8
 */
public class No22 {


    public static void main(String[] args) {
        No22 demo = new No22();
        List<String> strings = demo.generateParenthesis(4);

        for (String s : strings){
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        generate(n,n,"",result);
        return result;
    }

    private void generate(int l, int r, String out, List<String> result) {

        if(l < 0 || r < 0 || l > r){
            return;
        }

        if(l == 0 && r == 0){
            result.add(out);
        }

        generate(l-1,r,out+"(",result);
        generate(l,r-1,out+")",result);
    }
}
