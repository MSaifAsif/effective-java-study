package com.part.three.item.twentyone;

/**
 * Item 21: Design interfaces for posterity.
 *
 * When designing an interface, consider its future evolution. Adding methods later can break existing implementations.
 * Use default methods when possible to provide backward compatibility.
 *
 * This class demonstrates a bad example of an evolving interface and a good example using default methods.
 */
public class DesignInterfacesForPosterity {

    // Bad Example: Adding a method to an existing interface (breaking change)
    interface BadPrinter {
        void print();
        // Uncommenting this line would break existing implementations:
        // void scan();
    }

    static class SimplePrinter implements BadPrinter {
        @Override
        public void print() {
            System.out.println("SimplePrinter: Printing document");
        }
    }

    // Good Example: Using default method
    interface Printer {
        void print();

        default void scan() {
            System.out.println("Default scan method");
        }
    }

    static class AdvancedPrinter implements Printer {
        @Override
        public void print() {
            System.out.println("AdvancedPrinter: Printing document");
        }
    }

    public static void main(String[] args) {
        System.out.println("Design Interfaces for Posterity\n");

        // Bad Example
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();

        // Good Example
        Printer advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.scan();
    }
}
