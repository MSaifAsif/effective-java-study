package com.part.six.item.fourtyfive;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Item 45: Use streams judiciously.
 *
 * Streams are powerful but should be used when they improve clarity and performance.
 * Avoid using streams for simple tasks or when they make the code harder to understand.
 */
public class UseStreamsJudiciously {

    public static void badExample() {
        List<String> words = List.of("apple", "banana", "cherry");
        String result = "";
        for (String word : words) {
            if (word.length() > 5) {
                result += word.toUpperCase() + " ";
            }
        }
        System.out.println("Bad Example: Result = " + result.trim());
    }

    public static void goodExample() {
        List<String> words = List.of("apple", "banana", "cherry");
        String result = words.stream()
                             .filter(word -> word.length() > 5)
                             .map(String::toUpperCase)
                             .collect(Collectors.joining(" "));
        System.out.println("Good Example: Result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Use Streams Judiciously\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
