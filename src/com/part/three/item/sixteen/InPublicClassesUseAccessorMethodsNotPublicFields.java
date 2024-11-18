package com.part.three.item.sixteen;

/**
 * Item 16: In public classes, use accessor methods, not public fields.
 *
 * Public fields expose internal representation and break encapsulation. Use getter and setter methods instead.
 *
 * This class demonstrates a bad example with public fields and a good example using accessor methods.
 */
public class InPublicClassesUseAccessorMethodsNotPublicFields {

    // Bad Example: Public fields (exposes internal representation)
    static class BadCircle {
        public double radius;
    }

    // Good Example: Private fields with accessor methods
    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        System.out.println("In Public Classes, Use Accessor Methods, Not Public Fields\n");

        // Bad Example
        BadCircle badCircle = new BadCircle();
        badCircle.radius = 5.0;
        System.out.println("Bad Example: radius = " + badCircle.radius);

        // Good Example
        Circle circle = new Circle(5.0);
        circle.setRadius(7.0);
        System.out.println("Good Example: radius = " + circle.getRadius());
    }
}
