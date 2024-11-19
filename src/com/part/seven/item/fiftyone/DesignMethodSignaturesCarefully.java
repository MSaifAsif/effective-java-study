package com.part.seven.item.fiftyone;

/**
 * Item 51: Design method signatures carefully.
 *
 * Method signatures should be simple, clear, and consistent. Avoid overly long parameter lists
 * and ensure method names clearly convey their purpose.
 */
public class DesignMethodSignaturesCarefully {

    // Bad Example: Poorly named method with excessive parameters
    public static double doStuff(double a, double b, double c, double d) {
        return (a + b) / (c + d);
    }

    // Good Example: Well-designed method
    public static double calculateAverage(double sum, double count) {
        if (count == 0) {
            throw new IllegalArgumentException("Count must not be zero");
        }
        return sum / count;
    }

    public static void main(String[] args) {
        System.out.println("Design Method Signatures Carefully\n");

        // Bad Example
        System.out.println("Bad Example: Result = " + doStuff(10, 20, 2, 4));

        // Good Example
        System.out.println("Good Example: Result = " + calculateAverage(30, 3));
    }
}
