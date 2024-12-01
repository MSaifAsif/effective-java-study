package com.part.eight.item.sixtythree;

/**
 * Item 63: Don’t ignore exceptions.
 *
 * Always handle exceptions appropriately. Ignoring exceptions can hide bugs and lead to unexpected behavior.
 * This class demonstrates a bad example of ignoring exceptions and a good example of handling them.
 */
public class DontIgnoreExceptions {

    public static void badExample() {
        try {
            throw new Exception("Something went wrong");
        } catch (Exception e) {
            // Ignoring the exception
        }
        System.out.println("Bad Example: Continued execution despite exception");
    }

    public static void goodExample() {
        try {
            throw new Exception("Something went wrong");
        } catch (Exception e) {
            System.out.println("Good Example: Exception handled = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Don’t Ignore Exceptions\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
