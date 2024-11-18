package com.part.three.item.twentyfive;

/**
 * Item 25: Limit source files to a single top-level class.
 *
 * Placing multiple top-level classes in a single source file can cause unexpected behavior and make the code harder
 * to maintain. Always limit source files to a single top-level class.
 *
 * This class demonstrates a good practice of using a single top-level class in a source file.
 */
public class LimitSourceFilesToASingleTopLevelClass {

    public static void main(String[] args) {
        System.out.println("Limit Source Files to a Single Top-Level Class\n");

        // Example showing a single top-level class
        TopLevelClass example = new TopLevelClass();
        example.displayMessage();
    }
}

// Good Example: Single top-level class in the source file
class TopLevelClass {
    public void displayMessage() {
        System.out.println("This is a top-level class in its own source file.");
    }
}
