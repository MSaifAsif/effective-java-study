package com.part.one.item.four;

/**
 * Item 4: Enforce noninstantiability with a private constructor
 * Enforce non-instantiability with a private constructor
 */
public class NonInstantiabilityPrivateConstructor {
    public static void main(String[] args) {
        int sum = UtilsClassWithPrivateConstructor.sum(1, 2);
        System.out.println(sum);
    }
}

class UtilsClassWithPrivateConstructor {
    private UtilsClassWithPrivateConstructor() {
        // in case some reflection occurs to call this private method
        throw new AssertionError("Should not instantiate this class");
    }

    static int sum(int i, int j) {
        return i + j;
    }
}
