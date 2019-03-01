package com.lay.study.lamda;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author yalei.chen
 * @date 2018/1/12
 * @since JDK 1.8
 */
public class LamdaExample {

    public static void main(String[] args) {
//        threadTest();

//        sortTest();

//        removeIfTest();

//        replaceAllTest();

//        sort1Test();

        spliteratorTest();

//        reduceTest();

    }


    private static void reduceTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Integer lengthSum = stream.reduce(0,
        (sum, str) -> sum+str.length(),
                (a, b) -> a+b);
// int lengthSum = stream.mapToInt(str -> str.length()).sum();
        System.out.println(lengthSum);
    }

    private static void spliteratorTest() {
        // List.sort()方法结合Lambda表达式
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d","e", "f", "g", "h"));
        Spliterator<String> spliterator = list.spliterator();

        Spliterator<String> b = spliterator.trySplit();
        System.out.println(b);

        Spliterator<String> c = spliterator.trySplit();
        System.out.println(c);

        Spliterator<String> d = spliterator.trySplit();
        System.out.println(d);
    }

    private static void sort1Test() {
        // List.sort()方法结合Lambda表达式
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.sort((str1, str2) -> str1.length()-str2.length());

        System.out.println(list);
    }

    private static void replaceAllTest() {
        // 使用Lambda表达式实现
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.replaceAll(str -> {
            if(str.length()>3){
                return str.toUpperCase();
            }
            return str;
        });

        System.out.println(list);
    }

    private static void removeIfTest() {
        List<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(str -> str.length()>3); // 删除长度大于3的元素
        System.out.println(list);
    }

    private static void sortTest() {
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, (s1, s2) ->{// 省略参数表的类型
            if(s1 == null){
                return -1;
            }
            if(s2 == null){
                return 1;
            }
            return s1.length()-s2.length();
        });

        System.out.println(list);
    }

    private static void threadTest() {
        new Thread(
                () -> {
                    System.out.print("Hello");
                    System.out.println(" Lamda");
                }// 省略接口名和方法名
        ).start();
    }


}
