package com.lay.study.thread.used;

/**
 * @author yalei.chen
 * @date 2018/2/1
 * @since JDK 1.8
 */
public class ForLoopCalculator implements Calculator {
    @Override
    public long sumUp(long[] numbers) {

        long total = 0;
        for (long i : numbers) {
            total += i;
        }
        return total;
    }
}
