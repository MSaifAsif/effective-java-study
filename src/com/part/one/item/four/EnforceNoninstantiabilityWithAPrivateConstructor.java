package com.part.one.item.four;

/**
 * Item 4: Enforce noninstantiability with a private constructor.
 *
 * Utility classes (classes with only static methods and fields) should not be instantiated.
 * To enforce noninstantiability, make the constructor private.
 */
public class EnforceNoninstantiabilityWithAPrivateConstructor {

    // Utility class with private constructor
    private EnforceNoninstantiabilityWithAPrivateConstructor() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    public static void utilityMethod() {
        System.out.println("Utility method called");
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating noninstantiability with private constructor.");

        // Uncommenting the line below would cause a compilation error:
        // EnforceNoninstantiabilityWithAPrivateConstructor instance = new EnforceNoninstantiabilityWithAPrivateConstructor();

        // Using the utility method correctly
        EnforceNoninstantiabilityWithAPrivateConstructor.utilityMethod();
    }
}
