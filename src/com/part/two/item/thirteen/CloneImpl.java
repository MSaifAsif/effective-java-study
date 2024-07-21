package com.part.two.item.thirteen;

/**
 * Item 13: Override clone judiciously
 * If you've read the item about cloning in my book, especially if you read between the lines,
 * you will know that I think clone is deeply broken. [...] It's a shame that Cloneable is broken, but it happens.
 */
public class CloneImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        Object cloned = user.clone();
        System.out.println(cloned.toString());
    }
}

class User {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new AssertionError("Should not clone");
    }
}
