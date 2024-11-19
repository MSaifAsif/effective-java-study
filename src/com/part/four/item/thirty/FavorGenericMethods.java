package com.part.four.item.thirty;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 30: Favor generic methods.
 *
 * Generic methods provide type safety and can be more reusable than methods using raw types.
 * This class demonstrates a bad example without generics and a good example with a generic method.
 */
public class FavorGenericMethods {

    // Bad Example: Method using raw types
    public static List unsafeCopy(List source) {
        List copy = new ArrayList();
        copy.addAll(source);
        return copy;
    }

    // Good Example: Generic method
    public static <T> List<T> safeCopy(List<T> source) {
        return new ArrayList<>(source);
    }

    public static void main(String[] args) {
        System.out.println("Favor Generic Methods\n");

        // Bad Example
        List source = new ArrayList();
        source.add("Hello");
        source.add(42); // No type safety
        List copy = unsafeCopy(source);
        System.out.println("Bad Example: Copy = " + copy);

        // Good Example
        List<String> sourceGeneric = List.of("Hello", "World");
        List<String> copyGeneric = safeCopy(sourceGeneric);
        System.out.println("Good Example: Copy = " + copyGeneric);
    }
}
