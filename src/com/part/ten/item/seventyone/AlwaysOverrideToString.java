package com.part.ten.item.seventyone;

/**
 * Item 71: Always override toString.
 *
 * Providing a meaningful toString implementation improves debugging and makes your class easier to use and understand.
 */
public class AlwaysOverrideToString {

    static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + "}";
        }
    }

    public static void main(String[] args) {
        System.out.println("Always Override toString\n");

        Product product = new Product("Laptop", 999.99);
        System.out.println("Good Example: " + product);
    }
}
