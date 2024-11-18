package com.part.three.item.nineteen;

/**
 * Item 19: Design and document for inheritance or else prohibit it.
 *
 * If a class is designed for inheritance, it must provide documentation and well-defined hooks for subclasses.
 * If it’s not intended for inheritance, make the class final or ensure non-overridable methods.
 *
 * This class demonstrates a bad example of an undocumented subclass and a good example using final classes.
 */
public class DesignAndDocumentForInheritanceOrElseProhibitIt {

    // Bad Example: Undocumented inheritance
    static class BaseClass {
        public void doSomething() {
            System.out.println("BaseClass: Doing something");
        }
    }

    static class SubClass extends BaseClass {
        @Override
        public void doSomething() {
            System.out.println("SubClass: Overridden behavior");
        }
    }

    // Good Example: Using final class
    static final class FinalClass {
        public void doSomething() {
            System.out.println("FinalClass: Doing something");
        }
    }

    public static void main(String[] args) {
        System.out.println("Design and Document for Inheritance or Else Prohibit It\n");

        // Bad Example
        BaseClass base = new SubClass();
        base.doSomething();

        // Good Example
        FinalClass finalClass = new FinalClass();
        finalClass.doSomething();
    }
}
