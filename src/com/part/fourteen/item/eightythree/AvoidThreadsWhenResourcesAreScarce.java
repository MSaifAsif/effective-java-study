package com.part.fourteen.item.eightythree;

/**
 * Item 83: Avoid threads when resources are scarce.
 *
 * Threads are costly and can lead to resource contention. Use higher-level concurrency utilities
 * or asynchronous processing where possible to reduce overhead.
 */
public class AvoidThreadsWhenResourcesAreScarce {

    public static void badExample() {
        // Creating multiple threads manually
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("Bad Example: Thread executed")).start();
        }
    }

    public static void goodExample() {
        // Using ExecutorService to manage threads
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> System.out.println("Good Example: Task executed"));
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        System.out.println("Avoid Threads When Resources Are Scarce\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
