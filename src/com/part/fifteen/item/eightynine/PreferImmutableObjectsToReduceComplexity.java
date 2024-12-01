package com.part.fifteen.item.eightynine;

import java.util.Objects;

/**
 * Item 89: Prefer immutable objects to reduce complexity.
 *
 * Immutable objects are inherently thread-safe, easier to reason about, and reduce the potential for bugs.
 */
public final class PreferImmutableObjectsToReduceComplexity {

    private final String name;
    private final int age;

    public PreferImmutableObjectsToReduceComplexity(String name, int age) {
        this.name = Objects.requireNonNull(name, "Name must not be null");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PreferImmutableObjectsToReduceComplexity{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        System.out.println("Prefer Immutable Objects to Reduce Complexity\n");

        PreferImmutableObjectsToReduceComplexity obj = new PreferImmutableObjectsToReduceComplexity("Alice", 30);
        System.out.println("Good Example: " + obj);
    }
}
