package com.part.four.item.twentyseven;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 27: Eliminate unchecked warnings.
 *
 * Unchecked warnings indicate potential issues with type safety. Always try to eliminate these warnings
 * using proper generic types or suppress warnings with @SuppressWarnings annotation if necessary.
 *
 * This class demonstrates a bad example with unchecked warnings and a good example using generics correctly.
 */
public class EliminateUncheckedWarnings {

    @SuppressWarnings("unchecked")
    public static void badExample() {
        List list = new ArrayList(); // Raw type
        list.add("Hello");
        list.add(42);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void goodExample() {
        List<String> list = new ArrayList<>(); // Using generics
        list.add("Hello");
        // list.add(42); // Compile-time error

        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        System.out.println("Eliminate Unchecked Warnings\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
