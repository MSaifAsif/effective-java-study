package com.part.one.item.six;

/**
 * Item 6: Avoid creating unnecessary objects
 */
public class UnnecessaryObjects {
    public static void main(String[] args) {
        // this will create a new string object everytime it runs
        String unnecessaryString = new String("Hello");

        // this will reuse the static string due to string interning
        String itsFine = "Hello";
    }
}
