package com.part.five.item.thirtyfour;

/**
 * Item 34: Use enums instead of int constants.
 *
 * Using enums provides type safety, better readability, and built-in methods compared to int constants.
 * This class demonstrates a bad example using int constants and a good example using enums.
 */
public class UseEnumsInsteadOfIntConstants {

    // Bad Example: Int constants
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int BLUE = 3;

    // Good Example: Enum
    public enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        System.out.println("Use Enums Instead of Int Constants\n");

        // Bad Example
        int color = RED;
        System.out.println("Bad Example: Color = " + color);

        // Good Example
        Color enumColor = Color.RED;
        System.out.println("Good Example: Color = " + enumColor);
    }
}
