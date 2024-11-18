package com.part.one.item.six;

/**
 * Item 6: Avoid creating unnecessary objects.
 *
 * Creating unnecessary objects can impact performance, especially if the objects are created frequently.
 * Reusing immutable objects or using static factories can reduce object creation.
 *
 * This class demonstrates a bad example of creating unnecessary objects and a good example of reusing objects.
 */
public class AvoidCreatingUnnecessaryObjects {

    public static void badExample() {
        // Creating unnecessary String objects
        String s1 = new String("hello"); // Bad: Creates a new String object
        String s2 = new String("hello"); // Bad: Creates another new String object

        System.out.println("Bad Example: " + (s1 == s2)); // False, different objects
    }

    public static void goodExample() {
        // Reusing String literals
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("Good Example: " + (s1 == s2)); // True, same object reused
    }

    public static void main(String[] args) {
        System.out.println("Avoid Creating Unnecessary Objects\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
