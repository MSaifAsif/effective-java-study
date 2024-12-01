package com.part.eight.item.fiftyeight;

/**
 * Item 58: Favor the use of standard exceptions.
 *
 * Use standard exceptions like IllegalArgumentException, NullPointerException, etc., whenever possible,
 * to make your code more consistent and understandable.
 */
public class FavorTheUseOfStandardExceptions {

    // Bad Example: Custom exception for a common condition
    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }

    // Good Example: Using standard exception
    public static void validateInput(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must not be negative");
        }
    }

    public static void main(String[] args) {
        System.out.println("Favor the Use of Standard Exceptions\n");

        // Bad Example
        try {
            throw new CustomException("Custom exception used unnecessarily");
        } catch (CustomException e) {
            System.out.println("Bad Example: Exception = " + e.getMessage());
        }

        // Good Example
        try {
            validateInput(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Good Example: Exception = " + e.getMessage());
        }
    }
}
