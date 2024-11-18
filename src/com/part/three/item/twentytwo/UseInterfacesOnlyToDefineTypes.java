package com.part.three.item.twentytwo;

/**
 * Item 22: Use interfaces only to define types.
 *
 * Interfaces should not be used to define constants. Instead, use enums or constant utility classes.
 * This class demonstrates a bad example using a constant interface and a good example using a utility class.
 */
public class UseInterfacesOnlyToDefineTypes {

    // Bad Example: Constant interface (not recommended)
    interface BadConstants {
        int MAX_SIZE = 100;
    }

    // Good Example: Constant utility class
    final class Constants {
        public static final int MAX_SIZE = 100;

        private Constants() { }
    }

    public static void main(String[] args) {
        System.out.println("Use Interfaces Only to Define Types\n");

        // Bad Example
        System.out.println("Bad Example: MAX_SIZE = " + BadConstants.MAX_SIZE);

        // Good Example
        System.out.println("Good Example: MAX_SIZE = " + Constants.MAX_SIZE);
    }
}
