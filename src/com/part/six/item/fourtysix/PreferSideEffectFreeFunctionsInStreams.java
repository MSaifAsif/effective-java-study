package com.part.six.item.fourtysix;

import java.util.List;

/**
 * Item 46: Prefer side-effect-free functions in streams.
 *
 * Functions in streams should avoid side effects to maintain clarity, safety, and correctness.
 * This class demonstrates a bad example with side effects and a good example without side effects.
 */
public class PreferSideEffectFreeFunctionsInStreams {

    public static void badExample() {
        List<String> words = List.of("apple", "banana", "cherry");
        StringBuilder result = new StringBuilder();

        // Side effect: Modifying external state
        words.stream()
             .map(String::toUpperCase)
             .forEach(word -> result.append(word).append(" "));

        System.out.println("Bad Example: Result = " + result.toString().trim());
    }

    public static void goodExample() {
        List<String> words = List.of("apple", "banana", "cherry");

        // No side effects: Using collect to aggregate results
        String result = words.stream()
                             .map(String::toUpperCase)
                             .reduce("", (a, b) -> a + b + " ")
                             .trim();

        System.out.println("Good Example: Result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Prefer Side-Effect-Free Functions in Streams\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
