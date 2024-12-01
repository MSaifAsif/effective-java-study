package com.part.thirteen.item.seventyeight;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Item 78: Prefer thread-safe utilities to synchronization.
 *
 * Using thread-safe utilities such as `Collections.synchronizedList` can simplify
 * thread-safe code and reduce the risk of errors compared to manual synchronization.
 */
public class PreferThreadSafeUtilitiesToSynchronization {

    public static void badExample() {
        List<Integer> list = new ArrayList<>();
        Runnable task = () -> {
            synchronized (list) {
                list.add(1);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }

    public static void goodExample() {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Runnable task = () -> list.add(1);
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        System.out.println("Prefer Thread-Safe Utilities to Synchronization\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
