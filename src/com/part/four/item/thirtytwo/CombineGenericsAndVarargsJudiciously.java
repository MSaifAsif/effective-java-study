package com.part.four.item.thirtytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Item 32: Combine generics and varargs judiciously.
 *
 * Varargs and generics can be combined, but care must be taken to avoid heap pollution.
 * Use @SafeVarargs to suppress warnings when you can ensure safety.
 */
public class CombineGenericsAndVarargsJudiciously {

    @SafeVarargs
    public static <T> List<T> mergeLists(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static void main(String[] args) {
        System.out.println("Combine Generics and Varargs Judiciously\n");

        // Good Example
        List<String> mergedList = mergeLists("Hello", "World");
        System.out.println("Good Example: Merged list = " + mergedList);
    }
}
