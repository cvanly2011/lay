package com.lay.study.thread;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author yalei.chen
 * @Date 2017/9/26
 * @Since JDK 1.8
 */
public class UnsafeTest {

    private static final Unsafe unsafe = Unsafe.getUnsafe();


    private static final long valueOffset;

    static {
        try {
            valueOffset = unsafe.objectFieldOffset
                    (AtomicInteger.class.getDeclaredField("value"));
        } catch (Exception ex) { throw new Error(ex); }
    }

    public final boolean compareAndSet(int expect, int update) {
        return unsafe.compareAndSwapInt(this,valueOffset,1,2);
    }

    public static void main(String[] args) {
        UnsafeTest unsafeTest = new UnsafeTest();
        unsafeTest.compareAndSet(1,2);
    }
}
