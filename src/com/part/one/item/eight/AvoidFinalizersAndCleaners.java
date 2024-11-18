package com.part.one.item.eight;

/**
 * Item 8: Avoid finalizers and cleaners.
 *
 * Finalizers and cleaners are unpredictable and often unnecessary. They can cause performance issues
 * and may not be executed promptly. Instead, use try-with-resources or explicit close methods.
 *
 * This class demonstrates a bad example using a finalizer and a good example using try-with-resources.
 */
public class AvoidFinalizersAndCleaners {

    // Bad Example: Using a finalizer (deprecated approach)
    static class ResourceWithFinalizer {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalizer called (Bad Example)");
        }

        public void useResource() {
            System.out.println("Using resource (Bad Example)");
        }
    }

    // Good Example: Using try-with-resources
    static class Resource implements AutoCloseable {
        public void useResource() {
            System.out.println("Using resource (Good Example)");
        }

        @Override
        public void close() {
            System.out.println("Resource closed (Good Example)");
        }
    }

    public static void main(String[] args) {
        System.out.println("Avoid Finalizers and Cleaners\n");

        System.out.println("Running Bad Example:");
        ResourceWithFinalizer badResource = new ResourceWithFinalizer();
        badResource.useResource();

        System.out.println("\nRunning Good Example:");
        try (Resource goodResource = new Resource()) {
            goodResource.useResource();
        }
    }
}
