package com.part.three.item.twenty;

/**
 * Item 20: Prefer interfaces to abstract classes
 */
public class FavorInterfaceToAbstract {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.hello());

        AbstractClassUser classUser = new AbstractClassUser() {
            @Override
            public String hello() {
                return "A random implementation";
            }
        };

        System.out.println(classUser.echo());
    }
}

abstract class AbstractClassUser {
    public abstract String hello();
    public String echo() {
        return "Echo";
    }
}

class User extends AbstractClassUser {

    @Override
    public String hello() {
        return "HelloFromUsers implementation";
    }
}