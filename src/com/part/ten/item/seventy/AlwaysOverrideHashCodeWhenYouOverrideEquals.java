package com.part.ten.item.seventy;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Item 70: Always override hashCode when you override equals.
 *
 * If two objects are equal according to equals(), they must also have the same hashCode().
 * Failure to override hashCode can lead to incorrect behavior in hash-based collections.
 */
public class AlwaysOverrideHashCodeWhenYouOverrideEquals {

    // Bad Example: Does not override hashCode
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
            return Objects.equals(name, other.name);
        }
    }

    // Good Example: Overrides hashCode
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
            return Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Always Override hashCode When You Override Equals\n");

        // Bad Example
        Set<PersonBad> badSet = new HashSet<>();
        PersonBad badPerson = new PersonBad("Alice");
        badSet.add(badPerson);
        System.out.println("Bad Example: Contains 'Alice': " + badSet.contains(new PersonBad("Alice")));

        // Good Example
        Set<Person> goodSet = new HashSet<>();
        Person goodPerson = new Person("Alice");
        goodSet.add(goodPerson);
        System.out.println("Good Example: Contains 'Alice': " + goodSet.contains(new Person("Alice")));
    }
}
