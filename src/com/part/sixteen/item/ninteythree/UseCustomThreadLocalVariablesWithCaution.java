package com.part.sixteen.item.ninteythree;

/**
 * Item 93: Use custom ThreadLocal variables with caution.
 *
 * ThreadLocal variables can be useful but should be used sparingly to avoid memory leaks
 * and unintended behavior, especially in long-lived threads.
 */
public class UseCustomThreadLocalVariablesWithCaution {

    private static final ThreadLocal<Integer> threadLocalCounter = ThreadLocal.withInitial(() -> 0);

    public static void badExample() {
        threadLocalCounter.set(10);
        System.out.println("Bad Example: ThreadLocal Counter = " + threadLocalCounter.get());
        threadLocalCounter.remove(); // Required to avoid potential memory leak
    }

    public static void goodExample() {
        threadLocalCounter.set(20);
        System.out.println("Good Example: ThreadLocal Counter = " + threadLocalCounter.get());
        threadLocalCounter.remove();
    }

    public static void main(String[] args) {
        System.out.println("Use Custom ThreadLocal Variables with Caution\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
