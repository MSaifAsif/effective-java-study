package com.part.eleven.item.seventytwo;

/**
 * Item 72: Override clone judiciously.
 *
 * The clone method is tricky and error-prone. Favor alternatives like copy constructors or static factory methods.
 * If you override clone, ensure it performs a deep copy when necessary.
 */
public class OverrideCloneJudiciously implements Cloneable {

    private int[] data;

    public OverrideCloneJudiciously(int[] data) {
        this.data = data.clone();
    }

    @Override
    protected OverrideCloneJudiciously clone() {
        try {
            OverrideCloneJudiciously cloned = (OverrideCloneJudiciously) super.clone();
            cloned.data = data.clone(); // Deep copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    public int[] getData() {
        return data.clone();
    }

    public static void main(String[] args) {
        System.out.println("Override Clone Judiciously\n");

        OverrideCloneJudiciously original = new OverrideCloneJudiciously(new int[]{1, 2, 3});
        OverrideCloneJudiciously cloned = original.clone();

        System.out.println("Original data: " + java.util.Arrays.toString(original.getData()));
        System.out.println("Cloned data: " + java.util.Arrays.toString(cloned.getData()));

        // Modify cloned data
        cloned.getData()[0] = 99;

        System.out.println("After modification:");
        System.out.println("Original data: " + java.util.Arrays.toString(original.getData()));
        System.out.println("Cloned data: " + java.util.Arrays.toString(cloned.getData()));
    }
}
