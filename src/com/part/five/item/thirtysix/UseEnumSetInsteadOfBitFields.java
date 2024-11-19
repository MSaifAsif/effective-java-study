package com.part.five.item.thirtysix;

import java.util.EnumSet;

/**
 * Item 36: Use EnumSet instead of bit fields.
 *
 * EnumSet is a high-performance, type-safe alternative to traditional bit fields.
 * This class demonstrates a bad example using bit fields and a good example using EnumSet.
 */
public class UseEnumSetInsteadOfBitFields {

    // Bad Example: Using bit fields
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;

    public static void applyStyles(int styles) {
        if ((styles & STYLE_BOLD) != 0) System.out.println("Applying bold style");
        if ((styles & STYLE_ITALIC) != 0) System.out.println("Applying italic style");
    }

    // Good Example: Using EnumSet
    public enum Style { BOLD, ITALIC }

    public static void applyStyles(EnumSet<Style> styles) {
        if (styles.contains(Style.BOLD)) System.out.println("Applying bold style");
        if (styles.contains(Style.ITALIC)) System.out.println("Applying italic style");
    }

    public static void main(String[] args) {
        System.out.println("Use EnumSet Instead of Bit Fields\n");

        // Bad Example
        System.out.println("Bad Example:");
        applyStyles(STYLE_BOLD | STYLE_ITALIC);

        // Good Example
        System.out.println("\nGood Example:");
        applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
