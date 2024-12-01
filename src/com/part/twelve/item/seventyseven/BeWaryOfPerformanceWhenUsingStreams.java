package com.part.twelve.item.seventyseven;

import java.util.List;

/**
 * Item 77: Be wary of performance when using streams.
 *
 * Streams are powerful, but they may not always be the best choice for performance-critical operations.
 * This class demonstrates a bad example of inefficient stream usage and a good example using iteration.
 */
public class BeWaryOfPerformanceWhenUsingStreams {

    public static void badExample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)
                         .mapToInt(n -> n)
                         .sum();
        System.out.println("Bad Example: Sum of even numbers = " + sum);
    }

    public static void goodExample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println("Good Example: Sum of even numbers = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Be Wary of Performance When Using Streams\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
