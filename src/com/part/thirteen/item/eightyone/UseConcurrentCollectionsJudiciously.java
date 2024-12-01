package com.part.thirteen.item.eightyone;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Item 81: Use concurrent collections judiciously.
 *
 * Concurrent collections like ConcurrentHashMap are more efficient and safer than manually synchronized alternatives.
 * This class demonstrates their use.
 */
public class UseConcurrentCollectionsJudiciously {

    public static void goodExample() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        System.out.println("Good Example: Map = " + map);
    }

    public static void main(String[] args) {
        System.out.println("Use Concurrent Collections Judiciously\n");

        goodExample();
    }
}
