package com.part.twelve.item.seventyfour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Item 74: Use Java libraries over implementing your own.
 *
 * Prefer using well-tested Java libraries instead of writing your own implementation.
 * This reduces bugs, improves performance, and enhances maintainability.
 */
public class UseJavaLibrariesOverImplementingYourOwn {

    public static void badExample() {
        int[] array = {5, 3, 1, 4, 2};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Bad Example: Sorted array = " + Arrays.toString(array));
    }

    public static void goodExample() {
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);
        Collections.sort(list);
        System.out.println("Good Example: Sorted list = " + list);
    }

    public static void main(String[] args) {
        System.out.println("Use Java Libraries Over Implementing Your Own\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
