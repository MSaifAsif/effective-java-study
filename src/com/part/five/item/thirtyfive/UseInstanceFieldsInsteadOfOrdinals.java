package com.part.five.item.thirtyfive;

/**
 * Item 35: Use instance fields instead of ordinals.
 *
 * Using ordinal() to retrieve data tied to an enum constant is error-prone. Instead, associate data directly with the constant.
 * This class demonstrates a bad example using ordinal() and a good example with instance fields.
 */
public class UseInstanceFieldsInsteadOfOrdinals {

    // Bad Example: Using ordinal()
    public enum BadPhase {
        SOLID, LIQUID, GAS;

        public int getPhaseValue() {
            return ordinal(); // Avoid using ordinal()
        }
    }

    // Good Example: Using instance fields
    public enum Phase {
        SOLID(0), LIQUID(1), GAS(2);

        private final int phaseValue;

        Phase(int phaseValue) {
            this.phaseValue = phaseValue;
        }

        public int getPhaseValue() {
            return phaseValue;
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Instance Fields Instead of Ordinals\n");

        // Bad Example
        BadPhase badPhase = BadPhase.SOLID;
        System.out.println("Bad Example: Phase value = " + badPhase.getPhaseValue());

        // Good Example
        Phase phase = Phase.SOLID;
        System.out.println("Good Example: Phase value = " + phase.getPhaseValue());
    }
}
