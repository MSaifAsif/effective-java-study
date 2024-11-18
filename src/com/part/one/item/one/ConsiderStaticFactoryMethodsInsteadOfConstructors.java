package com.part.one.item.one;

/**
 * Item 1: Consider static factory methods instead of constructors.
 *
 * Instead of using public constructors for creating instances, consider using static factory methods.
 * Advantages:
 * 1. They have meaningful names, making the code more readable.
 * 2. They can return an existing instance instead of creating a new one (e.g., caching).
 * 3. They can return an instance of a subtype (flexibility).
 * 4. They can reduce verbosity when using generic types.
 *
 * Disadvantages:
 * 1. They cannot be used with subclassing (since constructors are not visible).
 * 2. They may be less discoverable since they do not stand out like constructors in documentation.
 *
 * This class demonstrates both bad and good examples of object creation.
 */
public class ConsiderStaticFactoryMethodsInsteadOfConstructors {

    // Bad Example: Using a public constructor
    static class Product {
        private final String name;

        // Public constructor
        public Product(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "'}";
        }
    }

    // Good Example: Using a static factory method
    static class Item {
        private final String name;

        // Private constructor, instance creation controlled by static factory method
        private Item(String name) {
            this.name = name;
        }

        /**
         * Static factory method to create an instance of Item.
         * This method provides better control and flexibility over object creation.
         */
        public static Item of(String name) {
            return new Item(name);
        }

        @Override
        public String toString() {
            return "Item{name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        // Demonstrating the bad example with a public constructor
        System.out.println("Bad Example: Using public constructors");
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Phone");

        System.out.println(product1);
        System.out.println(product2);

        // Demonstrating the good example with a static factory method
        System.out.println("\nGood Example: Using static factory methods");
        Item item1 = Item.of("Laptop");
        Item item2 = Item.of("Phone");

        System.out.println(item1);
        System.out.println(item2);

        // Showing potential benefits of a static factory method (e.g., caching)
        Item cachedItem = Item.of("Laptop");
        System.out.println("\nDemonstrating potential caching with static factory method:");
        System.out.println("Cached item reference: " + cachedItem);
    }
}
