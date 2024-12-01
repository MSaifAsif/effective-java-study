package com.part.eight.item.fiftyseven;

import java.io.IOException;

/**
 * Item 57: Avoid unnecessary use of checked exceptions.
 *
 * Use checked exceptions only for recoverable conditions and ensure they provide meaningful information.
 * This class demonstrates a bad example of using checked exceptions unnecessarily and a good example
 * where checked exceptions are justified.
 */
public class AvoidUnnecessaryUseOfCheckedExceptions {

    // Bad Example: Unnecessary checked exception
    public static void badMethod(boolean condition) throws IOException {
        if (!condition) {
            throw new IOException("Condition not met");
        }
    }

    // Good Example: Using unchecked exception
    public static void goodMethod(boolean condition) {
        if (!condition) {
            throw new IllegalArgumentException("Condition not met");
        }
    }

    public static void main(String[] args) {
        System.out.println("Avoid Unnecessary Use of Checked Exceptions\n");

        // Bad Example
        try {
            badMethod(false);
        } catch (IOException e) {
            System.out.println("Bad Example: Exception = " + e.getMessage());
        }

        // Good Example
        try {
            goodMethod(false);
        } catch (IllegalArgumentException e) {
            System.out.println("Good Example: Exception = " + e.getMessage());
        }
    }
}
