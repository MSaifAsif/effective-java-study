package com.part.three.item.seventeen;

/**
 * Item 17: Minimize mutability.
 *
 * Immutable objects are simpler, safer, and more thread-safe. To make a class immutable:
 * - Make the class final.
 * - Make all fields private and final.
 * - Provide no methods that modify the object’s state.
 *
 * This class demonstrates a mutable and an immutable implementation.
 */
public class MinimizeMutability {

    // Bad Example: Mutable class
    static class MutablePerson {
        private String name;

        public MutablePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // Good Example: Immutable class
    static final class ImmutablePerson {
        private final String name;

        public ImmutablePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Minimize Mutability\n");

        // Bad Example
        MutablePerson mutablePerson = new MutablePerson("John");
        mutablePerson.setName("Doe");
        System.out.println("Bad Example: Name = " + mutablePerson.getName());

        // Good Example
        ImmutablePerson immutablePerson = new ImmutablePerson("Jane");
        System.out.println("Good Example: Name = " + immutablePerson.getName());
    }
}
