package com.part.one.item.three;

/**
 * Item 3: Enforce the singleton property with a private constructor or an enum type.
 *
 * Singleton classes should ensure only one instance exists. This can be achieved by making the constructor private.
 * Using an enum for a singleton is generally recommended, as it provides inherent serialization and thread-safety.
 *
 * This class demonstrates both approaches.
 */
public class EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType {

    // Bad Example: Public constructor (incorrect singleton implementation)
    static class BadSingleton {
        public static final BadSingleton INSTANCE = new BadSingleton();

        private BadSingleton() { }
    }

    // Good Example 1: Singleton with private constructor
    static class Singleton {
        private static final Singleton INSTANCE = new Singleton();

        private Singleton() { }

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }

    // Good Example 2: Enum-based singleton
    enum EnumSingleton {
        INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("Bad Example (can be bypassed):");
        System.out.println(BadSingleton.INSTANCE);

        System.out.println("\nGood Example with Private Constructor:");
        System.out.println(Singleton.getInstance());

        System.out.println("\nGood Example with Enum-based Singleton:");
        System.out.println(EnumSingleton.INSTANCE);
    }
}
