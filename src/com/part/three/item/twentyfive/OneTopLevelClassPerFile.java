package com.part.three.item.twentyfive;

import java.util.Objects;

public class OneTopLevelClassPerFile {
    public static void main(String[] args) {
        User user = new User("hello", 2);
        System.out.println(user);

        AnotherUser anotherUser = new AnotherUser("Test", 1);
        System.out.println(anotherUser);
    }
}

record User(String name, int age) {
}

record AnotherUser(String name, int age) {
    public AnotherUser {
        // with validation
        Objects.requireNonNull(name);
    }
}
