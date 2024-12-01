package com.part.nine.item.sixtyeight;

/**
 * Item 68: Optimize judiciously.
 *
 * Optimize code only when necessary and based on actual performance bottlenecks. Premature optimization can
 * lead to complex, unmaintainable code.
 */
public class OptimizeJudiciously {

    public static void badExample() {
        long sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i; // Inefficient
        }
        System.out.println("Bad Example: Sum = " + sum);
    }

    public static void goodExample() {
        long sum = (long) Integer.MAX_VALUE * (Integer.MAX_VALUE - 1) / 2; // Optimized calculation
        System.out.println("Good Example: Sum = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Optimize Judiciously\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
