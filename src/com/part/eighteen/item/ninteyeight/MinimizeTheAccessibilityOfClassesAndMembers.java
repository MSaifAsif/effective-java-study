package com.part.eighteen.item.ninteyeight;

/**
 * Item 98: Minimize the accessibility of classes and members.
 *
 * Restrict the visibility of classes and members as much as possible to reduce coupling
 * and improve encapsulation.
 */
public class MinimizeTheAccessibilityOfClassesAndMembers {

    // Bad Example: Public field
    public int badValue;

    // Good Example: Private field with accessor
    private int goodValue;

    public int getGoodValue() {
        return goodValue;
    }

    public void setGoodValue(int value) {
        goodValue = value;
    }

    public static void main(String[] args) {
        System.out.println("Minimize the Accessibility of Classes and Members\n");

        // Bad Example
        MinimizeTheAccessibilityOfClassesAndMembers example = new MinimizeTheAccessibilityOfClassesAndMembers();
        example.badValue = 42;
        System.out.println("Bad Example: Value = " + example.badValue);

        // Good Example
        example.setGoodValue(42);
        System.out.println("Good Example: Value = " + example.getGoodValue());
    }
}
