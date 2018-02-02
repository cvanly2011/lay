package com.lay.study.thread;

import java.util.concurrent.*;

/**
 * @author yalei.chen
 * @date 2018/2/1
 * @since JDK 1.8
 */
public class CallableExample {

    public static void main(String[] args) {

        exectorService();
//        futureTask();

    }

    private static void exectorService() {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<String> result = executor.submit(task);
        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }

    private static void futureTask() {
        FutureTask<String> futureTask = new FutureTask<>(new Task());

        new Thread(futureTask).start();

        System.out.println(" Thread Main ");

        try {
            System.out.println("执行结果是 " + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}


class Task implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("子线程在进行计算");
        try { // 延时0.5秒
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Thread New Result";
    }
}


