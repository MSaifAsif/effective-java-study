package com.part.five.item.thirtynine;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Item 39: Prefer annotations to naming patterns.
 *
 * Annotations provide a better way to document metadata compared to naming conventions.
 * This class demonstrates a custom annotation and its use in a test framework.
 */
public class PreferAnnotationsToNamingPatterns {

    // Define a custom annotation
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Test {
    }

    // Example class using the custom annotation
    public static class ExampleTests {
        @Test
        public static void test1() {
            System.out.println("Test 1 executed");
        }

        @Test
        public static void test2() {
            System.out.println("Test 2 executed");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Prefer Annotations to Naming Patterns\n");

        // Use reflection to find and run annotated methods
        int tests = 0;
        int passed = 0;

        for (Method method : ExampleTests.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    method.invoke(null);
                    passed++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s%n", method, ex.getCause());
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
