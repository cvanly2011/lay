package com.lay.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yalei.chen
 * @date 2018/4/11
 * @since JDK 1.8
 */
public class BoundList<T> {

    private List<T> lists = new ArrayList<T>();

    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    private int size;

    public BoundList(int size) {
        this.size = size;
    }

    public void add(T t) throws InterruptedException{

        lock.lock();
        try {

            while (lists.size() == size){
                System.out.println("元素已满");
                notFull.await();
            }

            lists.add(t);
            notEmpty.signal();
            System.out.println("增加了一个元素");

        }finally {
            lock.unlock();
        }

    }

    public void remove() throws InterruptedException{

        lock.lock();
        try {

            while (lists.size() == 0){
                System.out.println("元素为空");
                notEmpty.await();
            }

            lists.remove(lists.size()-1);
            notFull.signal();
            System.out.println("删除了一个元素");

        }finally {
            lock.unlock();
        }

    }

}
