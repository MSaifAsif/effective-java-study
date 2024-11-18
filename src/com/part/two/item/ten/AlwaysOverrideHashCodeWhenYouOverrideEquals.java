package com.part.two.item.ten;

/**
 * Item 10: Always override hashCode when you override equals.
 *
 * If you override equals, you must also override hashCode. Failure to do so can lead to incorrect behavior
 * in hash-based collections like HashMap and HashSet.
 *
 * This class demonstrates a bad example without overriding hashCode and a good example that overrides it.
 */
import java.util.HashSet;
import java.util.Set;

public class AlwaysOverrideHashCodeWhenYouOverrideEquals {

    static class PersonBad {
        private final String name;

        public PersonBad(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof PersonBad)) return false;
            PersonBad other = (PersonBad) obj;
            return name.equals(other.name);
        }
    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Person)) return false;
            Person other = (Person) obj;
            return name.equals(other.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    public static void main(String[] args) {
        System.out.println("Always Override hashCode When You Override Equals\n");

        // Bad Example
        Set<PersonBad> setBad = new HashSet<>();
        PersonBad person1 = new PersonBad("John");
        setBad.add(person1);
        System.out.println("Bad Example: Set contains person1: " + setBad.contains(new PersonBad("John")));

        // Good Example
        Set<Person> setGood = new HashSet<>();
        Person person2 = new Person("John");
        setGood.add(person2);
        System.out.println("Good Example: Set contains person2: " + setGood.contains(new Person("John")));
    }
}
