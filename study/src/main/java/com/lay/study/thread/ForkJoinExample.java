package com.lay.study.thread;

import com.lay.study.thread.used.Calculator;
import com.lay.study.thread.used.ForLoopCalculator;
import com.lay.study.thread.used.ForkJoinCalculator;

import java.util.stream.LongStream;

/**
 * 利用ForkJoin计算1至1000的正整数之和
 * @author yalei.chen
 * @date 2018/2/1
 * @since JDK 1.8
 */
public class ForkJoinExample {

    public static void main(String[] args) {

        long[] numbers = LongStream.rangeClosed(1, 1000).toArray();
        Calculator calculator = new ForkJoinCalculator();
        System.out.println(calculator.sumUp(numbers));
    }


}
