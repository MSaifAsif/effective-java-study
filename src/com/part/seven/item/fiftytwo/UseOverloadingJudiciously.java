package com.part.seven.item.fiftytwo;

/**
 * Item 52: Use overloading judiciously.
 *
 * Overloading can cause confusion if the parameter types are too similar. Use overloading carefully
 * to ensure clarity and avoid unintentional ambiguity.
 */
public class UseOverloadingJudiciously {

    // Bad Example: Confusing overloads
    public static void print(String value) {
        System.out.println("String value: " + value);
    }

    public static void print(Object value) {
        System.out.println("Object value: " + value);
    }

    // Good Example: Using distinct method names
    public static void printString(String value) {
        System.out.println("String value: " + value);
    }

    public static void printObject(Object value) {
        System.out.println("Object value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("Use Overloading Judiciously\n");

        // Bad Example
        print("Hello");
        print(42);

        // Good Example
        printString("Hello");
        printObject(42);
    }
}
