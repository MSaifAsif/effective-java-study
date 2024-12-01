package com.part.fifteen.item.eightyeight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Item 88: Avoid ExecutorService shutdown leaks.
 *
 * Always properly shut down ExecutorService instances to prevent resource leaks and ensure all tasks are completed.
 */
public class AvoidExecutorServiceShutdownLeaks {

    public static void badExample() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> System.out.println("Bad Example: Task executed"));
        // Forgetting to shut down the executor
    }

    public static void goodExample() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            executor.submit(() -> System.out.println("Good Example: Task executed"));
        } finally {
            executor.shutdown();
        }
    }

    public static void main(String[] args) {
        System.out.println("Avoid ExecutorService Shutdown Leaks\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
