package com.part.four.item.thirtythree;

import java.util.HashMap;
import java.util.Map;

/**
 * Item 33: Consider typesafe heterogeneous containers.
 *
 * A typesafe heterogeneous container allows storing and retrieving objects of different types safely.
 * This class demonstrates a good example using a generic container.
 */
public class ConsiderTypesafeHeterogeneousContainers {

    static class Favorites {
        private final Map<Class<?>, Object> favorites = new HashMap<>();

        public <T> void putFavorite(Class<T> type, T instance) {
            favorites.put(type, type.cast(instance));
        }

        public <T> T getFavorite(Class<T> type) {
            return type.cast(favorites.get(type));
        }
    }

    public static void main(String[] args) {
        System.out.println("Consider Typesafe Heterogeneous Containers\n");

        // Good Example
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "Hello");
        favorites.putFavorite(Integer.class, 42);

        String favoriteString = favorites.getFavorite(String.class);
        Integer favoriteInteger = favorites.getFavorite(Integer.class);

        System.out.println("Favorite String: " + favoriteString);
        System.out.println("Favorite Integer: " + favoriteInteger);
    }
}
