package com.part.sixteen.item.ninteyone;

/**
 * Item 91: Always document thread safety assumptions.
 *
 * Clearly document whether a class is thread-safe, not thread-safe, or conditionally thread-safe.
 * This helps users understand how to use the class correctly in multithreaded environments.
 */
public class AlwaysDocumentThreadSafetyAssumptions {

    // Thread-safe example
    public static final class ThreadSafeCounter {
        private int count;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println("Always Document Thread Safety Assumptions\n");

        ThreadSafeCounter counter = new ThreadSafeCounter();
        counter.increment();
        System.out.println("Thread-safe Counter: " + counter.getCount());
    }
}
