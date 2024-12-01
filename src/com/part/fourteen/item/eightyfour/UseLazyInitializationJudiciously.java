package com.part.fourteen.item.eightyfour;

/**
 * Item 84: Use lazy initialization judiciously.
 *
 * Lazy initialization can improve performance for expensive objects but should be used only when necessary
 * to avoid complexity and thread-safety issues.
 */
public class UseLazyInitializationJudiciously {

    // Bad Example: Lazy initialization without thread safety
    private String badValue;

    public String getBadValue() {
        if (badValue == null) {
            badValue = "Expensive Initialization";
        }
        return badValue;
    }

    // Good Example: Thread-safe lazy initialization using synchronized block
    private volatile String goodValue;

    public String getGoodValue() {
        if (goodValue == null) {
            synchronized (this) {
                if (goodValue == null) {
                    goodValue = "Expensive Initialization";
                }
            }
        }
        return goodValue;
    }

    public static void main(String[] args) {
        UseLazyInitializationJudiciously example = new UseLazyInitializationJudiciously();

        System.out.println("Use Lazy Initialization Judiciously\n");

        System.out.println("Bad Example: Value = " + example.getBadValue());
        System.out.println("Good Example: Value = " + example.getGoodValue());
    }
}
