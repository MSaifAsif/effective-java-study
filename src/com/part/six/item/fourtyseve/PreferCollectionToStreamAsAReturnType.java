package com.part.six.item.fourtyseve;

import java.util.List;

/**
 * Item 47: Prefer Collection to Stream as a return type.
 *
 * Returning collections instead of streams provides better flexibility and usability for clients.
 * This class demonstrates a bad example returning a stream and a good example returning a collection.
 */
public class PreferCollectionToStreamAsAReturnType {

    // Bad Example: Returning a stream
    public static java.util.stream.Stream<String> getWordsStream() {
        return List.of("apple", "banana", "cherry").stream();
    }

    // Good Example: Returning a collection
    public static List<String> getWordsList() {
        return List.of("apple", "banana", "cherry");
    }

    public static void main(String[] args) {
        System.out.println("Prefer Collection to Stream as a Return Type\n");

        // Bad Example
        System.out.println("Bad Example: Words = ");
        getWordsStream().forEach(System.out::println);

        // Good Example
        System.out.println("\nGood Example: Words = " + getWordsList());
    }
}
