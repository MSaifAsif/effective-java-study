package com.part.thirteen.item.eighty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Item 80: Prefer executors and tasks to threads.
 *
 * Using the Executor framework provides better scalability and flexibility than manually managing threads.
 * This class demonstrates a bad example using threads and a good example using an ExecutorService.
 */
public class PreferExecutorsAndTasksToThreads {

    public static void badExample() {
        Thread t1 = new Thread(() -> System.out.println("Bad Example: Task 1 executed"));
        Thread t2 = new Thread(() -> System.out.println("Bad Example: Task 2 executed"));
        t1.start();
        t2.start();
    }

    public static void goodExample() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Good Example: Task 1 executed"));
        executor.submit(() -> System.out.println("Good Example: Task 2 executed"));
        executor.shutdown();
    }

    public static void main(String[] args) {
        System.out.println("Prefer Executors and Tasks to Threads\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
