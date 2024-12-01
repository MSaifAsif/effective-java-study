package com.part.fifteen.item.eightyseven;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Item 87: Prefer atomic variables to synchronization when updating single variables.
 *
 * Atomic variables like AtomicInteger provide a thread-safe way to update single variables
 * without the overhead of synchronization.
 */
public class PreferAtomicVariablesToSyncWhenUpdatingSingleVariables {

    // Bad Example: Using synchronized block
    private int badCounter = 0;

    public synchronized void incrementBad() {
        badCounter++;
    }

    // Good Example: Using AtomicInteger
    private final AtomicInteger goodCounter = new AtomicInteger();

    public void incrementGood() {
        goodCounter.incrementAndGet();
    }

    public static void main(String[] args) {
        PreferAtomicVariablesToSyncWhenUpdatingSingleVariables example = new PreferAtomicVariablesToSyncWhenUpdatingSingleVariables();

        System.out.println("Prefer Atomic Variables to Synchronization When Updating Single Variables\n");

        // Bad Example
        example.incrementBad();
        System.out.println("Bad Example: Counter = " + example.badCounter);

        // Good Example
        example.incrementGood();
        System.out.println("Good Example: Counter = " + example.goodCounter.get());
    }
}
