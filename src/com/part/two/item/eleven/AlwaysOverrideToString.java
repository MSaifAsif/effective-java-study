package com.part.two.item.eleven;

/**
 * Item 11: Always override toString.
 *
 * Providing a useful toString implementation makes it easier to debug and use instances of the class.
 * It should return a concise but informative representation of the object.
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
        Product product = new Product("Laptop", 999.99);
        System.out.println("toString Example: " + product);
    }
}
