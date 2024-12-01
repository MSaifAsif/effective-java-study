package com.part.eleven.item.seventythree;

import java.util.Arrays;

/**
 * Item 73: Consider implementing Comparable.
 *
 * Implementing Comparable allows objects to be sorted and used in sorted collections.
 * Always use a natural ordering that makes sense for the object.
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
        System.out.println("Consider Implementing Comparable\n");

        ConsiderImplementingComparable[] items = {
            new ConsiderImplementingComparable("Banana"),
            new ConsiderImplementingComparable("Apple"),
            new ConsiderImplementingComparable("Cherry")
        };

        Arrays.sort(items);
        System.out.println("Sorted items: " + Arrays.toString(items));
    }
}
