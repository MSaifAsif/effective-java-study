package com.part.two.item.fourteen;

/**
 * Item 14: Consider implementing Comparable
 */
public class ComparableImpl {
    public static void main(String[] args) {
        User one = new User();
        one.age = 12;

        User two = new User();
        two.age = 24;

        int i = one.compareTo(two);
        System.out.println(i);
    }
}

class User implements Comparable<User> {

    int age;
    int name;

    @Override
    public int compareTo(User o) {
        // return o.age > this.age ? -1 : o.age < this.age ? 1 : 0;
        return Integer.compare(this.age, o.age);
    }
}
