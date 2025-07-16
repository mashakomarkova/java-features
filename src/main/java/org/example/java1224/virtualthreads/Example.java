package org.example.java1224.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.startVirtualThread(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });
        t.join();

        Runnable task = () -> System.out.println("Hello from virtual thread");
        Thread thread = Thread.ofVirtual().start(task);
        thread.join();

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            executorService.submit(() -> System.out.println("Task 1"));
            executorService.submit(() -> System.out.println("Task 2"));
        }
    }
}
