package com.part.thirteen.item.eightytwo;

/**
 * Item 82: Document thread safety.
 *
 * Clearly document whether a class is thread-safe, not thread-safe, or conditionally thread-safe.
 * This class demonstrates how to document thread safety.
 */
public class DocumentThreadSafety {

    // Example of a thread-safe method
    public synchronized void threadSafeMethod() {
        System.out.println("This method is thread-safe.");
    }

    // Example of a not-thread-safe method
    public void notThreadSafeMethod() {
        System.out.println("This method is not thread-safe.");
    }

    public static void main(String[] args) {
        DocumentThreadSafety example = new DocumentThreadSafety();

        System.out.println("Document Thread Safety\n");

        System.out.println("Thread-Safe Method:");
        example.threadSafeMethod();

        System.out.println("\nNot Thread-Safe Method:");
        example.notThreadSafeMethod();
    }
}
