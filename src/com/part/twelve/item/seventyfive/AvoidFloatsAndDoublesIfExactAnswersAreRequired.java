package com.part.twelve.item.seventyfive;

import java.math.BigDecimal;

/**
 * Item 75: Avoid floats and doubles if exact answers are required.
 *
 * Floats and doubles are not suitable for precise calculations like monetary values.
 * Use BigDecimal, int, or long instead.
 */
public class AvoidFloatsAndDoublesIfExactAnswersAreRequired {

    public static void badExample() {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println("Bad Example: 0.1 + 0.2 = " + c);
    }

    public static void goodExample() {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal c = a.add(b);
        System.out.println("Good Example: 0.1 + 0.2 = " + c);
    }

    public static void main(String[] args) {
        System.out.println("Avoid Floats and Doubles If Exact Answers Are Required\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
