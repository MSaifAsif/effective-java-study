package com.part.one.item.five;

/**
 * Item 5: Prefer dependency injection to hardwiring resources.
 *
 * Hardwiring dependencies directly into a class reduces flexibility and testability.
 * Using dependency injection (passing dependencies via constructors, setters, or method parameters)
 * allows for greater flexibility and easier testing.
 *
 * This class demonstrates both bad and good examples of handling dependencies.
 */
public class PreferDependencyInjectionToHardwiringResources {

    // Bad Example: Hardwiring a dependency
    static class SpellCheckerBad {
        private final Dictionary dictionary = new Dictionary();

        public boolean checkSpelling(String word) {
            return dictionary.contains(word);
        }
    }

    // Good Example: Using dependency injection
    static class SpellCheckerGood {
        private final Dictionary dictionary;

        public SpellCheckerGood(Dictionary dictionary) {
            this.dictionary = dictionary;
        }

        public boolean checkSpelling(String word) {
            return dictionary.contains(word);
        }
    }

    // Simple dictionary class for demonstration
    static class Dictionary {
        public boolean contains(String word) {
            return "hello".equalsIgnoreCase(word);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bad Example: Hardwired dictionary dependency");
        SpellCheckerBad badChecker = new SpellCheckerBad();
        System.out.println("Check word 'hello': " + badChecker.checkSpelling("hello"));

        System.out.println("\nGood Example: Dependency injection");
        Dictionary customDictionary = new Dictionary();
        SpellCheckerGood goodChecker = new SpellCheckerGood(customDictionary);
        System.out.println("Check word 'hello': " + goodChecker.checkSpelling("hello"));
    }
}
