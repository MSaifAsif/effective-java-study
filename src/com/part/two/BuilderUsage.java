package com.part.two;

/**
 * Consider a builder when faced with many constructor parameters. Although Telescoping Constructor Pattern can be used
 * to create various constructors with the required parameters, it can become cumbersome to maintain all constuctors.
 * Inconsistent state may also be achieved if a object is created first and then individually each and every parameter is set.
 * Builder pattern ensures that the object is created in one go.
 */
public class BuilderUsage {

    public static void main(String[] args) {
        // without builder pattern
        User user = new User();
        user.setName("Hello");
        user.setAge(2);
        System.out.println(user);

        // with builder pattern
        UserWithBuilder userWithBuilder = new UserWithBuilder
                .Builder()
                .withName("BuilderName")
                .withAge(20)
                .build();

    }

}

class User {
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
}

class UserWithBuilder {
    private String name;
    private int age;

    private UserWithBuilder(Builder builder) {
        name = builder.name;
        age = builder.age;
    }

    static class Builder {
        private String name;
        private int age;

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withAge(int age) {
            this.age = age;
            return this;
        }

        UserWithBuilder build() {
            return new UserWithBuilder(this);
        }
    }
}