package com.part.fifteen.item.nintey;

/**
 * Item 90: Minimize the scope of variables.
 *
 * Reducing the scope of variables improves readability and reduces the likelihood of errors.
 * Declare variables as close as possible to their first use.
 */
public class MinimizeScopeOfVariables {

    public static void badExample() {
        int result = 0; // Declared too early
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Bad Example: Result = " + result);
    }

    public static void goodExample() {
        int result = 0; // Declared at the point of need
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Good Example: Result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Minimize the Scope of Variables\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
