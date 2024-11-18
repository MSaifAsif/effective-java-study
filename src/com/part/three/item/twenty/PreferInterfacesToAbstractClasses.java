package com.part.three.item.twenty;

/**
 * Item 20: Prefer interfaces to abstract classes.
 *
 * Interfaces are more flexible than abstract classes because a class can implement multiple interfaces but
 * can only extend one class. Interfaces also provide a better way to define types.
 *
 * This class demonstrates a bad example using an abstract class and a good example using an interface.
 */
public class PreferInterfacesToAbstractClasses {

    // Bad Example: Using an abstract class
    abstract static class AbstractWorker {
        abstract void work();
    }

    static class BadWorker extends AbstractWorker {
        @Override
        void work() {
            System.out.println("BadWorker: Working using abstract class");
        }
    }

    // Good Example: Using an interface
    interface Worker {
        void work();
    }

    static class GoodWorker implements Worker {
        @Override
        public void work() {
            System.out.println("GoodWorker: Working using interface");
        }
    }

    public static void main(String[] args) {
        System.out.println("Prefer Interfaces to Abstract Classes\n");

        // Bad Example
        AbstractWorker badWorker = new BadWorker();
        badWorker.work();

        // Good Example
        Worker goodWorker = new GoodWorker();
        goodWorker.work();
    }
}
