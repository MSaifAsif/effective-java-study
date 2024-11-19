package com.part.six.item.fourtyeight;

import java.util.stream.IntStream;

/**
 * Item 48: Use caution when making streams parallel.
 *
 * Parallel streams can improve performance for computationally intensive tasks but may lead to incorrect results
 * for non-thread-safe operations or tasks with dependencies.
 * This class demonstrates a bad example of using parallel streams incorrectly and a good example using them correctly.
 */
public class UseCautionWhenMakingStreamsParallel {

    public static void badExample() {
        // Bad Example: Race condition due to shared mutable state
        int[] sum = {0}; // Shared mutable state

        IntStream.range(1, 100).parallel().forEach(i -> sum[0] += i);

        System.out.println("Bad Example: Sum (Incorrect) = " + sum[0]);
    }

    public static void goodExample() {
        // Good Example: Using reduce for thread safety
        int sum = IntStream.range(1, 100).parallel().reduce(0, Integer::sum);

        System.out.println("Good Example: Sum (Correct) = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Use Caution When Making Streams Parallel\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
