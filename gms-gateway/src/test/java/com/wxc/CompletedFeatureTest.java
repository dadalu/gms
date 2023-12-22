package com.wxc;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletedFeatureTest {
    public static void main(String[] args) {
        int numThreads = 5;
        CompletableFuture<Void>[] futures = new CompletableFuture[numThreads];

        // 创建并启动异步任务
        for (int i = 0; i < numThreads; i++) {
            int finalI = i;
            futures[i] = CompletableFuture.runAsync(() -> {
                // 异步任务的逻辑
                System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
                // 这里可以放异步任务的具体逻辑
                try {
                    Thread.sleep(finalI * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        // 等待所有异步任务完成
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures);

        // 主线程的逻辑
        try {
            allOf.get(); // 阻塞等待所有异步任务完成
            System.out.println("All threads have finished. Main thread continues.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
