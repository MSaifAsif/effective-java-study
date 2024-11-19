package com.part.seven.item.fiftyfive;

import java.util.Optional;

/**
 * Item 55: Return Optionals judiciously.
 *
 * Optional is a good choice for returning potentially absent values, but it should not be overused,
 * especially for collections or primitive values.
 */
public class ReturnOptionalsJudiciously {

    // Bad Example: Returning null
    public static String findBadValue(String key) {
        if ("key".equals(key)) {
            return "value";
        }
        return null; // Forces null check
    }

    // Good Example: Returning Optional
    public static Optional<String> findGoodValue(String key) {
        if ("key".equals(key)) {
            return Optional.of("value");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("Return Optionals Judiciously\n");

        // Bad Example
        String badResult = findBadValue("key");
        if (badResult != null) {
            System.out.println("Bad Example: Found = " + badResult);
        } else {
            System.out.println("Bad Example: Value not found");
        }

        // Good Example
        Optional<String> goodResult = findGoodValue("key");
        goodResult.ifPresentOrElse(
                value -> System.out.println("Good Example: Found = " + value),
                () -> System.out.println("Good Example: Value not found")
        );
    }
}
