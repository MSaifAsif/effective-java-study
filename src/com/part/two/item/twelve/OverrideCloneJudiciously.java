package com.part.two.item.twelve;

/**
 * Item 12: Override clone judiciously.
 *
 * Cloning can be tricky and error-prone. It is recommended to use copy constructors or static factory methods instead.
 * This class demonstrates a proper implementation of clone.
 */
public class OverrideCloneJudiciously implements Cloneable {

    private int[] data;

    public OverrideCloneJudiciously(int[] data) {
        this.data = data.clone();
    }

    @Override
    protected OverrideCloneJudiciously clone() {
        return new OverrideCloneJudiciously(data);
    }

    public int[] getData() {
        return data.clone();
    }

    public static void main(String[] args) {
        OverrideCloneJudiciously original = new OverrideCloneJudiciously(new int[]{1, 2, 3});
        OverrideCloneJudiciously cloned = original.clone();

        System.out.println("Original data: " + java.util.Arrays.toString(original.getData()));
        System.out.println("Cloned data: " + java.util.Arrays.toString(cloned.getData()));
    }
}
