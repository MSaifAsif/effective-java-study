package com.part.eight.item.fiftysix;

/**
 * Item 56: Adhere to generally accepted naming conventions.
 *
 * Consistent and clear naming conventions improve code readability and maintainability.
 * Follow established naming standards for classes, methods, variables, and constants.
 */
public class AdhereToGenerallyAcceptedNamingConventions {

    // Bad Example: Poor naming conventions
    public static int calc(int x, int y) {
        return x + y;
    }

    // Good Example: Descriptive names following conventions
    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Adhere to Generally Accepted Naming Conventions\n");

        // Bad Example
        System.out.println("Bad Example: Result = " + calc(3, 5));

        // Good Example
        System.out.println("Good Example: Result = " + calculateSum(3, 5));
    }
}
