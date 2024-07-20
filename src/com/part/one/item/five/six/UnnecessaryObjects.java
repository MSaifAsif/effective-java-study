package com.part.one.item.five.six;

/**
 * Avoid Creating Unnecessary Objects
 */
public class UnnecessaryObjects {
    public static void main(String[] args) {
        // this will create a new string object everytime it runs
        String unnecessaryString = new String("Hello");

        // this will reuse the static string due to string interning
        String itsFine = "Hello";
    }
}
