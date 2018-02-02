package com.lay.study.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yalei.chen
 * @date 2018/2/1
 * @since JDK 1.8
 */
public class LockExample {



    public static void main(String[] args) {
        final Outputter1 output = new Outputter1();
        new Thread() {
            @Override
            public void run() {
                output.output("zhangsan");
            };
        }.start();
        new Thread() {
            @Override
            public void run() {
                output.output("lisi");
            };
        }.start();
    }
}

class Outputter1 {
    private Lock lock = new ReentrantLock();// 锁对象
    public void output(String name) {
        // TODO 线程输出方法
        lock.lock();// 得到锁
        try {
            for(int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i));
            }
        } finally {
            lock.unlock();// 释放锁
        }
    }
}
