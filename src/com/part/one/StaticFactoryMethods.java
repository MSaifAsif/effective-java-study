package com.part.one;

import java.util.*;

/**
 * Consider using static factory methods instead of constructors as these offer
 * better control over instance creation and improved readability.
 *
 * <ul>
 * <li>Constructors don’t have meaningful names. Static factory methods can have meaningful names</li>
 * <li>Static factory methods can return the same type that implement</li>
 * <li>Static factory methods can encapsulate all the logic</li>
 * <li>so they can be used for moving this additional logic out of constructors.</li>
 * <li>Static factory methods can be controlled-instanced methods e.g Singleton pattern</li>
 * </ul>
 */
public class StaticFactoryMethods {


    public static void main(String[] args) {
        // String example
        String value1 = String.valueOf(1);
        String value3 = String.valueOf(true);
        String value4 = String.valueOf('a');

        // Optional example
        Optional<String> value2 = Optional.of("HelloWorld");


        // Collections example
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("HelloWorld");
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        Map<String, Integer> aKeyValueMap = new HashMap<>();
        aKeyValueMap.put("key", 1);

        Collection<String> syncedCollection = Collections.synchronizedCollection(stringArrayList);
        Set<?> syncedSet = Collections.synchronizedSet(new HashSet<>());
        List<Integer> unmodifiableList = Collections.unmodifiableList(integerArrayList);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(aKeyValueMap);

    }
}