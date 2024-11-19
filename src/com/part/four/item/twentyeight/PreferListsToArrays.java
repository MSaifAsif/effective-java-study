package com.part.four.item.twentyeight;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 28: Prefer lists to arrays.
 *
 * Arrays are covariant but not type-safe, whereas lists are invariant and provide better type safety.
 * Using lists instead of arrays helps avoid runtime ArrayStoreException and allows for generics,
 * enabling compile-time type checking.
 */
public class PreferListsToArrays {

    public static void badExample() {
        Object[] array = new String[2];
        array[0] = "Hello";
        try {
            array[1] = 42; // Throws ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Bad Example: Caught ArrayStoreException");
        }
    }

    public static void goodExample() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(42); // Compile-time error

        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        System.out.println("Prefer Lists to Arrays\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
