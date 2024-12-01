package com.part.ninteen.item.hundredandone;

/**
 * Item 101: Prefer alternatives to Java serialization.
 *
 * Java serialization is inherently flawed and should be avoided in favor of more robust,
 * flexible, and secure alternatives like JSON, XML, or Protocol Buffers.
 */
public class PreferAlternativesToJavaSerialization {

    public static void main(String[] args) {
        System.out.println("Prefer Alternatives to Java Serialization\n");

        // Bad Example: Relying on Java serialization
        System.out.println("Bad Example: Using Java serialization can lead to vulnerabilities.");

        // Good Example: Using JSON (e.g., libraries like Gson or Jackson)
        String jsonExample = "{\"name\":\"Alice\", \"age\":30}";
        System.out.println("Good Example: Use JSON for serialization.");
        System.out.println("Example JSON String: " + jsonExample);

        // Suggestion
        System.out.println("\nConsider using libraries like Gson or Jackson for serialization:");
        System.out.println("e.g., Gson gson = new Gson(); String json = gson.toJson(object);");
    }
}
