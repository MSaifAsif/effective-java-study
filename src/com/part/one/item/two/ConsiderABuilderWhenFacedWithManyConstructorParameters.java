package com.part.one.item.two;

/**
 * Item 2: Consider a builder when faced with many constructor parameters.
 *
 * When a class has many parameters, especially optional ones, using a constructor or telescoping constructor pattern
 * can lead to readability and maintainability issues. The builder pattern provides a flexible solution by
 * allowing you to set each parameter in a readable manner.
 *
 * This class demonstrates both a telescoping constructor (bad) and a builder pattern (good).
 */
public class ConsiderABuilderWhenFacedWithManyConstructorParameters {

    // Bad Example: Telescoping constructor pattern
    static class NutritionFactsTelescoping {
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;

        public NutritionFactsTelescoping(int servingSize, int servings) {
            this(servingSize, servings, 0);
        }

        public NutritionFactsTelescoping(int servingSize, int servings, int calories) {
            this(servingSize, servings, calories, 0);
        }

        public NutritionFactsTelescoping(int servingSize, int servings, int calories, int fat) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
        }

        @Override
        public String toString() {
            return "NutritionFactsTelescoping{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", calories=" + calories +
                    ", fat=" + fat +
                    '}';
        }
    }

    // Good Example: Builder pattern
    static class NutritionFacts {
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;

        public static class Builder {
            // Required parameters
            private final int servingSize;
            private final int servings;

            // Optional parameters - initialized to default values
            private int calories = 0;
            private int fat = 0;

            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder calories(int val) {
                calories = val;
                return this;
            }

            public Builder fat(int val) {
                fat = val;
                return this;
            }

            public NutritionFacts build() {
                return new NutritionFacts(this);
            }
        }

        private NutritionFacts(Builder builder) {
            servingSize = builder.servingSize;
            servings = builder.servings;
            calories = builder.calories;
            fat = builder.fat;
        }

        @Override
        public String toString() {
            return "NutritionFacts{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", calories=" + calories +
                    ", fat=" + fat +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Bad Example: Using telescoping constructors
        NutritionFactsTelescoping nf1 = new NutritionFactsTelescoping(240, 8);
        NutritionFactsTelescoping nf2 = new NutritionFactsTelescoping(240, 8, 100);
        NutritionFactsTelescoping nf3 = new NutritionFactsTelescoping(240, 8, 100, 35);

        System.out.println("Telescoping Constructors:");
        System.out.println(nf1);
        System.out.println(nf2);
        System.out.println(nf3);

        // Good Example: Using builder pattern
        NutritionFacts nf4 = new NutritionFacts.Builder(240, 8).calories(100).fat(35).build();
        System.out.println("\nBuilder Pattern:");
        System.out.println(nf4);
    }
}
