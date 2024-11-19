package com.part.seven.item.fiftyfour;

import java.util.Collections;
import java.util.List;

/**
 * Item 54: Return empty collections or arrays, not nulls.
 *
 * Returning null instead of an empty collection or array forces the client to handle null checks,
 * leading to more error-prone code.
 */
public class ReturnEmptyCollectionsOrArraysNotNulls {

    // Bad Example: Returning null
    public static List<String> getBadItems() {
        return null; // Forces client to handle null
    }

    // Good Example: Returning an empty collection
    public static List<String> getGoodItems() {
        return Collections.emptyList(); // Avoids null
    }

    public static void main(String[] args) {
        System.out.println("Return Empty Collections or Arrays, Not Nulls\n");

        // Bad Example
        List<String> badItems = getBadItems();
        if (badItems != null) {
            System.out.println("Bad Example: Items = " + badItems);
        } else {
            System.out.println("Bad Example: Items is null");
        }

        // Good Example
        List<String> goodItems = getGoodItems();
        System.out.println("Good Example: Items = " + goodItems);
    }
}
