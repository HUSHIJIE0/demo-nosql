package com.example.demo.multithreading.callableandfuture.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<Integer> f = es.submit(() ->{
            Thread.sleep(10000);
            System.out.println("处理完成");
            // 结果
            return 100;
        });

        // do something

//        Integer result = f.get();
//        System.out.println(result);
        System.out.println("1234");
        while (true) {
            if (f.isDone()) {
                System.out.println("完成！");
                System.out.println(f.get());
                System.exit(0);
            }else{
                System.out.println("任务未完成！");
            }
        }
    }
}
