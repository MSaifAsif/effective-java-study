package com.part.three.item.twentythree;

/**
 * Item 23: Prefer class hierarchies to tagged classes.
 *
 * Tagged classes (using a field to indicate type) are error-prone and hard to maintain. Use class hierarchies instead.
 * This class demonstrates a bad example of a tagged class and a good example using class hierarchy.
 */
public class PreferClassHierarchiesToTaggedClasses {

    // Bad Example: Tagged class
    static class Figure {
        enum Shape { RECTANGLE, CIRCLE }
        final Shape shape;
        double length;
        double width;
        double radius;

        Figure(double radius) {
            shape = Shape.CIRCLE;
            this.radius = radius;
        }

        Figure(double length, double width) {
            shape = Shape.RECTANGLE;
            this.length = length;
            this.width = width;
        }

        double area() {
            switch (shape) {
                case RECTANGLE:
                    return length * width;
                case CIRCLE:
                    return Math.PI * radius * radius;
                default:
                    throw new AssertionError(shape);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Prefer Class Hierarchies to Tagged Classes\n");

        Figure circle = new Figure(5);
        System.out.println("Circle area: " + circle.area());

        Figure rectangle = new Figure(10, 20);
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
