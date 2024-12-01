package com.part.sixteen.item.ninteyfour;

/**
 * Item 94: Use enums for singletons.
 *
 * Enums provide a simple and robust way to implement the singleton pattern.
 * They ensure thread safety, serialization correctness, and protection against reflection attacks.
 */
public enum UseEnumsForSingletons {

    INSTANCE;

    public void performAction() {
        System.out.println("Singleton action performed");
    }

    public static void main(String[] args) {
        System.out.println("Use Enums for Singletons\n");

        UseEnumsForSingletons instance = UseEnumsForSingletons.INSTANCE;
        instance.performAction();
    }
}
