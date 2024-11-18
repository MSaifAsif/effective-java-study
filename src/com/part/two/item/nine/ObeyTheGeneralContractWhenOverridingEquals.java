package com.part.two.item.nine;

/**
 * Item 9: Obey the general contract when overriding equals.
 *
 * The equals method must be reflexive, symmetric, transitive, consistent, and must return false for null comparisons.
 * Failing to follow these rules can result in incorrect behavior in collections and other classes.
 *
 * This class demonstrates a bad example of breaking the contract and a good example that follows the rules.
 */
public class ObeyTheGeneralContractWhenOverridingEquals {

    // Bad Example: Violating symmetry
    static class PointBad {
        private final int x, y;

        public PointBad(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PointBad) {
                PointBad other = (PointBad) obj;
                return x == other.x && y == other.y;
            }
            return false;
        }
    }

    // Good Example: Properly overriding equals
    static class Point {
        private final int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }
    }

    public static void main(String[] args) {
        System.out.println("Obey the General Contract When Overriding Equals\n");

        // Bad Example
        PointBad p1 = new PointBad(1, 2);
        PointBad p2 = new PointBad(1, 2);
        System.out.println("Bad Example: p1.equals(p2): " + p1.equals(p2));

        // Good Example
        Point p3 = new Point(1, 2);
        Point p4 = new Point(1, 2);
        System.out.println("Good Example: p3.equals(p4): " + p3.equals(p4));
    }
}
