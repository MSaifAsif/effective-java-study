package com.part.six.item.fourtythree;

import java.util.Arrays;

/**
 * Item 43: Prefer method references to lambdas.
 *
 * Method references are even more concise and readable than lambdas. Use them when they improve clarity.
 */
public class PreferMethodReferencesToLambdas {

    public static void badExample() {
        String[] words = {"apple", "banana", "cherry"};
        Arrays.sort(words, (o1, o2) -> o1.compareToIgnoreCase(o2));

        System.out.println("Bad Example: Sorted words = " + Arrays.toString(words));
    }

    public static void goodExample() {
        String[] words = {"apple", "banana", "cherry"};
        Arrays.sort(words, String::compareToIgnoreCase);

        System.out.println("Good Example: Sorted words = " + Arrays.toString(words));
    }

    public static void main(String[] args) {
        System.out.println("Prefer Method References to Lambdas\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
