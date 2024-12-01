package com.part.eight.item.sixtyone;

/**
 * Item 61: Include failure-capture information in exceptions.
 *
 * Include detailed failure information in exceptions to make debugging easier.
 * This class demonstrates a bad example with insufficient details and a good example with proper failure-capture information.
 */
public class IncludeFailureCaptureInformationInExceptions {

    // Good Example: Including failure information
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot divide " + numerator + " by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println("Include Failure-Capture Information in Exceptions\n");

        try {
            System.out.println("Result: " + divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
