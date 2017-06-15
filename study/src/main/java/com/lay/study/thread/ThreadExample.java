package com.lay.study.thread;

/**
 * Created by lay on 2017/6/7.
 */
public class ThreadExample {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<100; i++){
            new Thread("" + i){

                public void run(){
                    System.out.println("Thread: " + getName() + "running");
                }
            }.start();
        }
    }

}
