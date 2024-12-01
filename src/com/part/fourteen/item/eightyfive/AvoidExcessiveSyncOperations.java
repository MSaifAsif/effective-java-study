package com.part.fourteen.item.eightyfive;

/**
 * Item 85: Avoid excessive synchronization operations.
 *
 * Overusing synchronized blocks or locks can lead to deadlocks and degraded performance.
 * This class demonstrates a bad example with excessive synchronization and a good example with proper locking.
 */
public class AvoidExcessiveSyncOperations {

    // Bad Example: Synchronizing the entire method unnecessarily
    public synchronized void badMethod() {
        System.out.println("Bad Example: Excessively synchronized method");
    }

    // Good Example: Synchronizing only necessary parts
    private final Object lock = new Object();

    public void goodMethod() {
        synchronized (lock) {
            System.out.println("Good Example: Minimally synchronized block");
        }
    }

    public static void main(String[] args) {
        AvoidExcessiveSyncOperations example = new AvoidExcessiveSyncOperations();

        System.out.println("Avoid Excessive Synchronization Operations\n");

        System.out.println("Running Bad Example:");
        example.badMethod();

        System.out.println("\nRunning Good Example:");
        example.goodMethod();
    }
}
