package com.part.eighteen.item.ninteynine;

import java.util.Objects;

/**
 * Item 99: Prefer immutable objects.
 *
 * Immutable objects are easier to use, safer, and thread-safe by default.
 * This class demonstrates an immutable object design.
 */
public final class PreferImmutableObjects {

    private final String name;
    private final int age;

    public PreferImmutableObjects(String name, int age) {
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
        return "PreferImmutableObjects{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        System.out.println("Prefer Immutable Objects\n");

        PreferImmutableObjects obj = new PreferImmutableObjects("Alice", 30);
        System.out.println("Good Example: " + obj);
    }
}
