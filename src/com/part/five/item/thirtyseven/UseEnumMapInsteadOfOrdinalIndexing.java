package com.part.five.item.thirtyseven;

import java.util.EnumMap;
import java.util.Map;

/**
 * Item 37: Use EnumMap instead of ordinal indexing.
 *
 * EnumMap is a more readable, type-safe alternative to using an array indexed by ordinals.
 * This class demonstrates a bad example using ordinal indexing and a good example using EnumMap.
 */
public class UseEnumMapInsteadOfOrdinalIndexing {

    public enum Phase { SOLID, LIQUID, GAS }

    // Bad Example: Using ordinal indexing
    public static final String[] PHASE_DESCRIPTIONS = {
        "Solid phase", "Liquid phase", "Gas phase"
    };

    public static String getDescriptionByOrdinal(Phase phase) {
        return PHASE_DESCRIPTIONS[phase.ordinal()];
    }

    // Good Example: Using EnumMap
    public static final Map<Phase, String> PHASE_DESCRIPTIONS_MAP = new EnumMap<>(Phase.class);

    static {
        PHASE_DESCRIPTIONS_MAP.put(Phase.SOLID, "Solid phase");
        PHASE_DESCRIPTIONS_MAP.put(Phase.LIQUID, "Liquid phase");
        PHASE_DESCRIPTIONS_MAP.put(Phase.GAS, "Gas phase");
    }

    public static String getDescriptionByEnumMap(Phase phase) {
        return PHASE_DESCRIPTIONS_MAP.get(phase);
    }

    public static void main(String[] args) {
        System.out.println("Use EnumMap Instead of Ordinal Indexing\n");

        // Bad Example
        System.out.println("Bad Example: " + getDescriptionByOrdinal(Phase.SOLID));

        // Good Example
        System.out.println("Good Example: " + getDescriptionByEnumMap(Phase.SOLID));
    }
}
