package com.part.seventeen.item.ninteysix;

import java.lang.reflect.Method;

/**
 * Item 96: Avoid reflection for performance and security.
 *
 * Reflection bypasses compile-time checks, leading to brittle and less secure code.
 * Use reflection sparingly and prefer standard approaches when possible.
 */
public class AvoidReflectionForPerformanceAndSecurity {

    public static void badExample() {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method method = clazz.getMethod("toUpperCase");
            String result = (String) method.invoke("hello");
            System.out.println("Bad Example: Result = " + result);
        } catch (Exception e) {
            System.out.println("Bad Example: Exception = " + e.getMessage());
        }
    }

    public static void goodExample() {
        String result = "hello".toUpperCase();
        System.out.println("Good Example: Result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("Avoid Reflection for Performance and Security\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
