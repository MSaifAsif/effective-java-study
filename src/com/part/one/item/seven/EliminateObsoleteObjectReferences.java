package com.part.one.item.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 7: Eliminate obsolete object references.
 *
 * Failing to eliminate obsolete references can lead to memory leaks.
 * This often happens when objects are retained longer than necessary, such as in a cache or a long-lived collection.
 *
 * This class demonstrates a bad example of not clearing references and a good example of proper cleanup.
 */
public class EliminateObsoleteObjectReferences {

    public static void badExample() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Item " + i);
        }
        // Forgetting to clear the list after use
        System.out.println("Bad Example: List size (potential memory leak): " + list.size());
    }

    public static void goodExample() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Item " + i);
        }
        list.clear(); // Properly clearing the list
        System.out.println("Good Example: List size after clearing: " + list.size());
    }

    public static void main(String[] args) {
        System.out.println("Eliminate Obsolete Object References\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
