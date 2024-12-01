package com.part.twelve.item.seventysix;

import java.util.UUID;

/**
 * Item 76: Avoid strings where other types are more appropriate.
 *
 * Using strings for non-textual data like numeric values, enums, or IDs can lead to errors and inefficiency.
 * Use appropriate types instead.
 */
public class AvoidStringsWhereOtherTypesAreMoreAppropriate {

    public static void badExample() {
        String id = "12345"; // Using string for ID
        System.out.println("Bad Example: ID = " + id);
    }

    public static void goodExample() {
        UUID id = UUID.randomUUID(); // Using UUID for unique ID
        System.out.println("Good Example: ID = " + id);
    }

    public static void main(String[] args) {
        System.out.println("Avoid Strings Where Other Types Are More Appropriate\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
