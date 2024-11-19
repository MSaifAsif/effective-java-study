package com.part.seven.item.fourtynine;

/**
 * Item 49: Check parameters for validity.
 *
 * Always validate method parameters to ensure correctness and avoid unexpected behavior or security vulnerabilities.
 * This class demonstrates a bad example without parameter validation and a good example with validation.
 */
public class CheckParametersForValidity {

    // Bad Example: No parameter validation
    public static int divide(int numerator, int denominator) {
        return numerator / denominator; // Throws ArithmeticException for zero denominator
    }

    // Good Example: With parameter validation
    public static int safeDivide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println("Check Parameters for Validity\n");

        // Bad Example
        try {
            System.out.println("Bad Example: Result = " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Bad Example: Exception = " + e.getMessage());
        }

        // Good Example
        try {
            System.out.println("Good Example: Result = " + safeDivide(10, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Good Example: Exception = " + e.getMessage());
        }
    }
}
