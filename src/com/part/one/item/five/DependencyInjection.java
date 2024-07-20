package com.part.one.item.five;

public class DependencyInjection {

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.speak());

        Dog dog = new Dog();
        System.out.println(dog.speak());
    }


}

class Human implements Talkable {

    @Override
    public String speak() {
        return "Hello";
    }
}


class Dog implements Talkable {

    @Override
    public String speak() {
        return "Bark";
    }
}
