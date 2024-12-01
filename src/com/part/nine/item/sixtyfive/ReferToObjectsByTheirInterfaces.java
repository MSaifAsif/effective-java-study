package com.part.nine.item.sixtyfive;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 65: Refer to objects by their interfaces.
 *
 * Use interfaces to refer to objects instead of concrete classes. This promotes flexibility,
 * makes code easier to modify, and supports different implementations.
 */
public class ReferToObjectsByTheirInterfaces {

    public static void badExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        System.out.println("Bad Example: List = " + list);
    }

    public static void goodExample() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        System.out.println("Good Example: List = " + list);
    }

    public static void main(String[] args) {
        System.out.println("Refer to Objects by Their Interfaces\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
