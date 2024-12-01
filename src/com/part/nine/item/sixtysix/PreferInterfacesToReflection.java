package com.part.nine.item.sixtysix;

import java.lang.reflect.Method;

/**
 * Item 66: Prefer interfaces to reflection.
 *
 * Reflection can bypass compile-time type checking, leading to brittle code and runtime errors.
 * Use interfaces and other standard approaches instead of reflection.
 */
public class PreferInterfacesToReflection {

    public static void badExample() {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method method = clazz.getMethod("toUpperCase");
            Object result = method.invoke("hello");
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
        System.out.println("Prefer Interfaces to Reflection\n");

        System.out.println("Running Bad Example:");
        badExample();

        System.out.println("\nRunning Good Example:");
        goodExample();
    }
}
