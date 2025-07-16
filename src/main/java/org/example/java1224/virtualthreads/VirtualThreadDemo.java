package org.example.java1224.virtualthreads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadDemo {

    static final int TASK_COUNT = 10_000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running with Platform Threads:");
        runWithExecutor(Executors.newFixedThreadPool(100));

        System.out.println("\nRunning with Virtual Threads:");
        runWithExecutor(Executors.newVirtualThreadPerTaskExecutor());
    }

    static void runWithExecutor(ExecutorService executor) throws InterruptedException {
        long start = System.currentTimeMillis();

        CountDownLatch latch = new CountDownLatch(TASK_COUNT);

        for (int i = 0; i < TASK_COUNT; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();

        long duration = System.currentTimeMillis() - start;
        System.out.println("Completed " + TASK_COUNT + " tasks in " + duration + " ms");
        executor.shutdown();

    }
}
