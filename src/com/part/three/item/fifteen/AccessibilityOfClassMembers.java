package com.part.three.item.fifteen;

/**
 * Item 15: Minimize the accessibility of classes and members
 */
public class AccessibilityOfClassMembers {
    public static void main(String[] args) {
        PrivateUser user = new PrivateUser();
        user.setAge(1);
        user.setName("SomeName");
        System.out.println(user);
    }
}

final class PrivateUser {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + this.hashCode() + "[User.name=" + this.name + ", User.age=" + this.age + "]";
    }
}