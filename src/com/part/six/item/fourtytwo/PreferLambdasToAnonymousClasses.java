package com.part.six.item.fourtytwo;

import java.util.Comparator;

/**
 * Item 42: Prefer lambdas to anonymous classes.
 *
 * Lambdas are more concise and readable compared to anonymous classes. Use lambdas wherever possible,
 * unless you need more control or additional functionality.
 */
public class PreferLambdasToAnonymousClasses {

    public static void badExample() {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        System.out.println("Bad Example: Anonymous class comparator result: " + comparator.compare("apple", "banana"));
    }

    public static void goodExample() {
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        System.out.println("Good Example: Lambda comparator result: " + comparator.compare("apple", "banana"));
    }

    public static void main(String[] args) {
        System.out.println("Prefer Lambdas to Anonymous Classes\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
