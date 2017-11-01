package com.lay.study.algorithm.leetcode;

import java.util.*;

/**
 * @Author yalei.chen
 * @Date 2017/10/12
 * @Since JDK 1.8
 */
public class No49 {

    public static void main(String[] args) {

        List<List<String>> lists = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        for (List<String> list : lists){

            for (String s:list){
                System.out.println(s);
            }
            System.out.println("=======");
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.trim().toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else {
                List<String> value = new ArrayList<>();
                value.add(str);
                map.put(key, value);
            }
        }

        Set<String> keys = map.keySet();

        for (String key:keys) {


            List<String> item = new ArrayList<>();
            for (String v : map.get(key)){
                item.add(v);
            }

            result.add(item);
        }



        return result;
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.trim().toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else {
                List<String> value = new ArrayList<>();
                value.add(str);
                map.put(key, value);
            }
        }

        Set<String> keys = map.keySet();

        for (String key:keys) {


            List<String> item = new ArrayList<>();
            for (String v : map.get(key)){
                item.add(v);
            }

            result.add(item);
        }



        return result;
    }
}
