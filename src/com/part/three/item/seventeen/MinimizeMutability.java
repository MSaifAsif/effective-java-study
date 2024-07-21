package com.part.three.item.seventeen;

/**
 * Item 17: Minimize mutability
 */
public class MinimizeMutability {
    public static void main(String[] args) {
        MutableUser mutableUser = new MutableUser("hello", 2);
        System.out.println(mutableUser);
    }
}

final class MutableUser {
    private final String name;
    private final int age;

    public MutableUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

}