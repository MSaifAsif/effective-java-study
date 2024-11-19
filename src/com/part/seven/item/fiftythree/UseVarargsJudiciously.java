package com.part.seven.item.fiftythree;

/**
 * Item 53: Use varargs judiciously.
 *
 * Varargs methods provide flexibility but should be used carefully to avoid misuse, such as passing a large number of arguments.
 * Validate input and avoid creating unnecessary objects in performance-critical methods.
 */
public class UseVarargsJudiciously {

    // Bad Example: No input validation
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Good Example: Validating input
    public static void printMinimumTwoNumbers(int first, int second, int... others) {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        for (int number : others) {
            System.out.println("Other: " + number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Varargs Judiciously\n");

        // Bad Example
        System.out.println("Bad Example:");
        printNumbers();

        // Good Example
        System.out.println("\nGood Example:");
        printMinimumTwoNumbers(1, 2, 3, 4, 5);
    }
}
