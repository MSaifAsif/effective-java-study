package com.part.four.item.twentynine;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 29: Favor generic types.
 *
 * Using generic types eliminates the need for casting and provides better type safety.
 * This class demonstrates a bad example without generics and a good example using generic types.
 */
public class FavorGenericTypes {

    public static void badExample() {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);

        int sum = 0;
        for (Object obj : numbers) {
            sum += (int) obj; // Requires explicit cast
        }
        System.out.println("Bad Example: Sum = " + sum);
    }

    public static void goodExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        int sum = 0;
        for (int num : numbers) {
            sum += num; // No need for casting
        }
        System.out.println("Good Example: Sum = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Favor Generic Types\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
