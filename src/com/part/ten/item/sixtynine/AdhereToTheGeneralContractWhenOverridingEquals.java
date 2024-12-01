package com.part.ten.item.sixtynine;

/**
 * Item 69: Adhere to the general contract when overriding equals.
 *
 * When overriding equals, ensure it satisfies reflexivity, symmetry, transitivity, consistency, and
 * that it returns false for null comparisons. Violating the contract can lead to incorrect behavior in collections.
 */
public class AdhereToTheGeneralContractWhenOverridingEquals {

    // Bad Example: Violates symmetry
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
            return false; // Symmetry issue with subclasses
        }
    }

    // Good Example: Properly overrides equals
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
        System.out.println("Adhere to the General Contract When Overriding Equals\n");

        // Bad Example
        PointBad badPoint1 = new PointBad(1, 2);
        PointBad badPoint2 = new PointBad(1, 2);
        System.out.println("Bad Example: badPoint1.equals(badPoint2) = " + badPoint1.equals(badPoint2));

        // Good Example
        Point goodPoint1 = new Point(1, 2);
        Point goodPoint2 = new Point(1, 2);
        System.out.println("Good Example: goodPoint1.equals(goodPoint2) = " + goodPoint1.equals(goodPoint2));
    }
}
