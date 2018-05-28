package com.lay.study.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yalei.chen
 * @date 2018/2/2
 * @since JDK 1.8
 */
public class HashMapExample {

    public static void main(String[] args) {
        hashDemo();

//        hash("str");
    }

    private static void hashDemo() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);

        System.out.println(map.get("数学"));
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }


    static final int hash(Object key) {
        int h;
        h = key.hashCode();
        int i = h >>> 16;
        int i1 = h ^ i;
        return (key == null) ? 0 : i1;
    }
}
