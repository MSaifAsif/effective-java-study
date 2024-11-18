package com.part.three.item.fifteen;

/**
 * Item 15: Minimize the accessibility of classes and members.
 *
 * To promote encapsulation and reduce coupling, keep classes and members as private as possible.
 * Use the minimum necessary access level and only make members public when necessary.
 *
 * This class demonstrates a bad example of exposing internal members and a good example of proper encapsulation.
 */
public class MinimizeTheAccessibilityOfClassesAndMembers {

    // Bad Example: Public fields (violates encapsulation)
    static class BadPoint {
        public int x;
        public int y;
    }

    // Good Example: Private fields with accessor methods (encapsulation)
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        System.out.println("Minimize the Accessibility of Classes and Members\n");

        // Bad Example
        BadPoint badPoint = new BadPoint();
        badPoint.x = 10;
        badPoint.y = 20;
        System.out.println("Bad Example: x = " + badPoint.x + ", y = " + badPoint.y);

        // Good Example
        Point point = new Point(10, 20);
        System.out.println("Good Example: x = " + point.getX() + ", y = " + point.getY());
    }
}
