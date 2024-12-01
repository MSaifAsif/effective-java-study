package com.part.nine.item.sixtyfour;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Item 64: Consider using APIs over handwritten code.
 *
 * Using well-tested APIs is generally better than writing custom code. It reduces bugs,
 * improves maintainability, and leverages optimized implementations.
 * This class demonstrates a bad example using custom code and a good example using APIs.
 */
public class ConsiderUsingAPIsOverHandwrittenCode {

    public static void badExample() {
        List<String> words = List.of("apple", "banana", "cherry");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.toUpperCase()).append(", ");
        }
        System.out.println("Bad Example: Result = " + result.substring(0, result.length() - 2));
    }

    public static void goodExample() {
        List<String> words = List.of("apple", "banana", "cherry");
        String result = words.stream()
                             .map(String::toUpperCase)
                             .collect(Collectors.joining(", "));
        System.out.println("Good Example: Result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Consider Using APIs Over Handwritten Code\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
