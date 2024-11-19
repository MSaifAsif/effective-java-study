package com.part.five.item.thirtyeight;

/**
 * Item 38: Emulate extensible enums with interfaces.
 *
 * Enums are not extensible, but you can achieve similar functionality by using interfaces
 * and having each enum implement the interface. This provides flexibility while preserving type safety.
 */
public class EmulateExtensibleEnumsWithInterfaces {

    // Enum implementing the interface
    public enum BasicOperation implements Operation {
        PLUS("+") {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            public double apply(double x, double y) {
                return x - y;
            }
        };

        private final String symbol;

        BasicOperation(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }

    // Interface for operations
    public interface Operation {
        double apply(double x, double y);
    }

    public static void main(String[] args) {
        System.out.println("Emulate Extensible Enums with Interfaces\n");

        // Using BasicOperation
        double x = 5.0, y = 3.0;
        for (Operation op : BasicOperation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
