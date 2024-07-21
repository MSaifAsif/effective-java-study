package com.part.three.item.twentytwo;

/**
 * Item 22: Use interfaces only to define types
 */
public interface Talkable {
    String echo();
}


class Human implements Talkable {

    @Override
    public String echo() {
        return "Hello from human";
    }
}

class Cat implements Talkable {

    @Override
    public String echo() {
        return "Meow";
    }
}