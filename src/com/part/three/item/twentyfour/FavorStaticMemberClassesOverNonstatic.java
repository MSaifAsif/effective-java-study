package com.part.three.item.twentyfour;

/**
 * Item 24: Favor static member classes over nonstatic.
 *
 * Nonstatic member classes have an implicit reference to their enclosing instance, which can cause memory leaks
 * and make the code harder to understand. Favor static member classes unless you need access to the enclosing instance.
 *
 * This class demonstrates a bad example using a nonstatic member class and a good example using a static member class.
 */
public class FavorStaticMemberClassesOverNonstatic {

    // Bad Example: Nonstatic member class (retains reference to enclosing instance)
    static class OuterClass {
        private int value = 42;

        class NonStaticInnerClass {
            public int getValue() {
                return value;
            }
        }
    }

    // Good Example: Static member class
    static class OuterClassGood {
        private static int value = 42;

        static class StaticInnerClass {
            public int getValue() {
                return value;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Favor Static Member Classes Over Nonstatic\n");

        // Bad Example
        OuterClass outer = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticInner = outer.new NonStaticInnerClass();
        System.out.println("Bad Example: Value from non-static inner class = " + nonStaticInner.getValue());

        // Good Example
        OuterClassGood.StaticInnerClass staticInner = new OuterClassGood.StaticInnerClass();
        System.out.println("Good Example: Value from static inner class = " + staticInner.getValue());
    }
}
