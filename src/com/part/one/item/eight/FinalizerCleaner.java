package com.part.one.item.eight;

import java.lang.ref.Cleaner;

/**
 * Dont use finalize, Cleaner is another way to do some logic work during GC but still we
 * should not depend on any logic during these methods
 */
public class FinalizerCleaner {

    private final static Cleaner cleaner = Cleaner.create();

    public static void main(String[] args) {
        AnotherUser anotherUser = new AnotherUser();
        System.out.println(anotherUser);
        anotherUser = null;
    }
}

/*
class User {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
 */

class AnotherUser {
    private final Cleaner cleaner = Cleaner.create();

    public AnotherUser() {
        cleaner.register(this, () -> System.out.println("Doing some cleaning logic here"));
    }
}