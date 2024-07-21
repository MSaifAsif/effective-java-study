package com.part.one.item.seven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Item 7: Eliminate obsolete object references
 * Holding onto obsolete references constitutes memory leaks in Java.
 * This is also termed as unintentional object retention.
 * <p>
 * Nulling out a reference to remove obsolete references to an object is good, but one must not overdo it.
 * The best way to eliminate an obsolete reference is to reuse the variable in which it was contained or to
 * let it fall out of scope.
 */
public class ObsoleteReference {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // when list is not used, dereference it

        list = null;
    }
}
