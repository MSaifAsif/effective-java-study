package com.part.two.item.thirteen;

import java.util.Arrays;

/**
 * Item 13: Consider implementing Comparable.
 *
 * Implementing Comparable allows objects to be sorted and used in sorted collections.
 */
public class ConsiderImplementingComparable implements Comparable<ConsiderImplementingComparable> {

    private final String name;

    public ConsiderImplementingComparable(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ConsiderImplementingComparable other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ConsiderImplementingComparable[] items = {
            new ConsiderImplementingComparable("Banana"),
            new ConsiderImplementingComparable("Apple"),
            new ConsiderImplementingComparable("Cherry")
        };

        Arrays.sort(items);
        System.out.println("Sorted items: " + Arrays.toString(items));
    }
}
