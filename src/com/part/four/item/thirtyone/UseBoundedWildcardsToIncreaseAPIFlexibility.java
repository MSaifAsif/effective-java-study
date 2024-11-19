package com.part.four.item.thirtyone;

import java.util.List;

/**
 * Item 31: Use bounded wildcards to increase API flexibility.
 *
 * Using bounded wildcards (e.g., `<? extends T>`) in method parameters allows for more flexible APIs
 * without compromising type safety.
 * This class demonstrates a bad example without bounded wildcards and a good example with them.
 */
public class UseBoundedWildcardsToIncreaseAPIFlexibility {

    // Bad Example: Method without bounded wildcards
    public static void addNumbers(List<Number> list) {
        list.add(1);
        list.add(1.5);
    }

    // Good Example: Method with bounded wildcard
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Bounded Wildcards to Increase API Flexibility\n");

        // Good Example
        List<Integer> integers = List.of(1, 2, 3);
        System.out.println("Good Example: Printing numbers");
        printNumbers(integers);
    }
}
