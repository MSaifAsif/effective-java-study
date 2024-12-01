package com.part.fourteen.item.eightysix;

/**
 * Item 86: Minimize the scope of synchronization.
 *
 * Keeping the scope of synchronized blocks small reduces contention and improves performance.
 * This class demonstrates minimizing the scope of synchronization.
 */
public class MinimizeScopeOfSync {

    private final Object lock = new Object();

    public void badExample() {
        synchronized (lock) {
            System.out.println("Bad Example: Synchronizing the entire method");
            System.out.println("Performing unrelated tasks within the lock");
        }
    }

    public void goodExample() {
        System.out.println("Good Example: Performing unrelated tasks outside the lock");

        synchronized (lock) {
            System.out.println("Minimizing the synchronized block to critical section");
        }
    }

    public static void main(String[] args) {
        MinimizeScopeOfSync example = new MinimizeScopeOfSync();

        System.out.println("Minimize the Scope of Synchronization\n");

        System.out.println("Running Bad Example:");
        example.badExample();

        System.out.println("\nRunning Good Example:");
        example.goodExample();
    }
}
