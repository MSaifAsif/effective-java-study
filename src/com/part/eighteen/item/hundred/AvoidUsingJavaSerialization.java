package com.part.eighteen.item.hundred;

/**
 * Item 100: Avoid using Java serialization.
 *
 * Java serialization is error-prone and can lead to vulnerabilities.
 * Prefer alternatives such as JSON or protocol buffers for object persistence.
 */
public class AvoidUsingJavaSerialization {

    public static void main(String[] args) {
        System.out.println("Avoid Using Java Serialization\n");

        System.out.println("Example: Use libraries like Jackson or Gson for serialization.");
        System.out.println("JSON Example: {\"name\": \"Alice\", \"age\": 30}");
    }
}
