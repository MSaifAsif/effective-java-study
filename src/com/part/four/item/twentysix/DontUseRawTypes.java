package com.part.four.item.twentysix;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 26: Don't use raw types.
 *
 * Raw types (e.g., List instead of List<String>) do not provide type safety and can lead to runtime errors.
 * Always use generics to ensure compile-time type checking.
 *
 * This class demonstrates a bad example using raw types and a good example using generics.
 */
public class DontUseRawTypes {

    public static void badExample() {
        List list = new ArrayList(); // Raw type
        list.add("Hello");
        list.add(42); // No type safety

        for (Object obj : list) {
            System.out.println(obj); // May cause ClassCastException at runtime
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
        System.out.println("Don't Use Raw Types\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
