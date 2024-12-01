package com.part.sixteen.item.ninteytwo;

/**
 * Item 92: Avoid instance pooling.
 *
 * Instance pooling is often unnecessary and can lead to performance degradation in modern JVMs,
 * as object creation is inexpensive and garbage collection is efficient.
 */
public class AvoidInstancePooling {

    // Bad Example: Instance pooling
    static class PooledInstance {
        private static final PooledInstance instance = new PooledInstance();

        private PooledInstance() {}

        public static PooledInstance getInstance() {
            return instance;
        }
    }

    // Good Example: Create objects on demand
    static class NonPooledInstance {
        public NonPooledInstance() {}

        public static NonPooledInstance createInstance() {
            return new NonPooledInstance();
        }
    }

    public static void main(String[] args) {
        System.out.println("Avoid Instance Pooling\n");

        // Bad Example
        PooledInstance pooled = PooledInstance.getInstance();
        System.out.println("Bad Example: Pooled instance = " + pooled);

        // Good Example
        NonPooledInstance nonPooled = NonPooledInstance.createInstance();
        System.out.println("Good Example: Non-pooled instance = " + nonPooled);
    }
}
