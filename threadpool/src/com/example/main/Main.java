package com.example.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // pool of 3 threads

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Running Task " + taskId + " on " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // no more tasks can be submitted
    }
}
