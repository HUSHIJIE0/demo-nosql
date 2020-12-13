package com.example.demo.multithreading.callableandfuture;

import java.util.concurrent.*;

public class CalBFutrueTest {

    public static void main(String[] args) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        final Future<String> submit = newCachedThreadPool.submit(new TaskCallback());
        System.out.println(Thread.currentThread().getName() + "-主线程开始执行");
        new Thread(() -> {
            try {
                String result = submit.get();
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("主线程执行任务...");
        if (newCachedThreadPool != null) {
            //关闭线程池
            newCachedThreadPool.shutdown();
        }
    }
}

class TaskCallback implements Callable<String> {
    public String call() throws Exception {
        System.out.println("子线程正在执行任务,请等待5s");
        Thread.sleep(5000);
        System.out.println("子线程 任务结束");
        return "子进程返回结果！";
    }
}
