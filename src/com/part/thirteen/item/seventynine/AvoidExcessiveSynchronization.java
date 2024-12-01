package com.part.thirteen.item.seventynine;

/**
 * Item 79: Avoid excessive synchronization.
 *
 * Excessive synchronization can cause deadlocks and degrade performance.
 * Synchronize only when necessary and prefer higher-level abstractions.
 */
public class AvoidExcessiveSynchronization {

    // Bad Example: Excessive synchronization
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
        AvoidExcessiveSynchronization example = new AvoidExcessiveSynchronization();

        System.out.println("Avoid Excessive Synchronization\n");

        System.out.println("Running Bad Example:");
        example.badMethod();

        System.out.println("\nRunning Good Example:");
        example.goodMethod();
    }
}
