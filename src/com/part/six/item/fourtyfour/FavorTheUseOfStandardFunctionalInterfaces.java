package com.part.six.item.fourtyfour;

import java.util.function.Function;

/**
 * Item 44: Favor the use of standard functional interfaces.
 *
 * Prefer using standard functional interfaces like Function, Supplier, Consumer, etc., instead of creating custom ones.
 */
public class FavorTheUseOfStandardFunctionalInterfaces {

    public static void badExample() {
        interface CustomFunction {
            int apply(String input);
        }

        CustomFunction lengthFunction = input -> input.length();
        System.out.println("Bad Example: Length of 'apple' = " + lengthFunction.apply("apple"));
    }

    public static void goodExample() {
        Function<String, Integer> lengthFunction = String::length;
        System.out.println("Good Example: Length of 'apple' = " + lengthFunction.apply("apple"));
    }

    public static void main(String[] args) {
        System.out.println("Favor the Use of Standard Functional Interfaces\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
