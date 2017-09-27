package com.lay.study.thread;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @Author yalei.chen
 * @Date 2017/9/26
 * @Since JDK 1.8
 */
public class AtomicReferenceFieldUpdaterStudy {

    public static void main(String[] args) {
        AtomicReferenceFieldUpdater updater= AtomicReferenceFieldUpdater.newUpdater(Dog.class,String.class,"name");
        Dog dog1=new Dog();
        updater.compareAndSet(dog1,dog1.name,"test") ;
        System.out.println(dog1.name);

    }
}


class Dog
{
    volatile String name="dog1";
}
