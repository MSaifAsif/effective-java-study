package com.part.eight.item.fiftynine;

/**
 * Item 59: Throw exceptions appropriate to the abstraction.
 *
 * Avoid leaking implementation details through exceptions. Throw exceptions that make sense in the context
 * of the abstraction.
 */
public class ThrowExceptionsAppropriateToTheAbstraction {

    // Bad Example: Leaking implementation details
    public static void divide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Division by zero in internal calculation", e);
        }
    }

    // Good Example: Throwing appropriate exception
    public static void safeDivide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Throw Exceptions Appropriate to the Abstraction\n");

        // Bad Example
        try {
            divide(10, 0);
        } catch (RuntimeException e) {
            System.out.println("Bad Example: Exception = " + e.getMessage());
        }

        // Good Example
        try {
            safeDivide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Good Example: Exception = " + e.getMessage());
        }
    }
}
