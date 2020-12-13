package com.example.demo.multithreading.callableandfuture.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("开始:" + System.currentTimeMillis());
//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("开始耗时计算:" + System.currentTimeMillis());
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("结束耗时计算:" + System.currentTimeMillis());
//            return 100;
//        });
//        completableFuture.whenComplete((result, e) -> {
//            System.out.println("回调结果:" + result);
//        });
//        System.out.println("结束:" + System.currentTimeMillis());
//        new CountDownLatch(1).await();

        System.out.println("===============================================");

        long l = System.currentTimeMillis();
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("在回调中执行耗时操作...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100;
        });
        completableFuture = completableFuture.thenCompose(i -> {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("在回调的回调中执行耗时操作...");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return i + 100;
            });
        });
        completableFuture.whenComplete((result, e) -> {
            System.out.println("计算结果:" + result);
        });
        System.out.println("主线程运算耗时:" + (System.currentTimeMillis() - l) + " ms");
        new CountDownLatch(1).await();
    }
}
