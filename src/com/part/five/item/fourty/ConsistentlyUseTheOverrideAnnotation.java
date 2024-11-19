package com.part.five.item.fourty;

/**
 * Item 40: Consistently use the @Override annotation.
 *
 * The @Override annotation ensures that a method correctly overrides a superclass or interface method.
 * This prevents subtle bugs due to typos or incorrect method signatures.
 */
public class ConsistentlyUseTheOverrideAnnotation {

    static class Parent {
        public void showMessage() {
            System.out.println("Parent message");
        }
    }

    static class Child extends Parent {
        @Override
        public void showMessage() {
            System.out.println("Child message");
        }

        // Uncommenting this would cause a compile-time error without @Override
        // @Override
        // public void showMsg() {
        //     System.out.println("Incorrect override");
        // }
    }

    public static void main(String[] args) {
        System.out.println("Consistently Use the @Override Annotation\n");

        Parent parent = new Parent();
        Parent child = new Child();

        parent.showMessage();
        child.showMessage();
    }
}
