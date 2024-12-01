package com.part.nine.item.sixtyseven;

/**
 * Item 67: Use native methods judiciously.
 *
 * Native methods can be useful but should be used sparingly due to potential security risks,
 * portability issues, and performance trade-offs. Modern Java APIs often make native methods unnecessary.
 */
public class UseNativeMethodsJudiciously {

    public static void main(String[] args) {
        System.out.println("Use Native Methods Judiciously\n");

        System.out.println("Example: Instead of writing a custom native method for math operations, use:");
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
    }
}
