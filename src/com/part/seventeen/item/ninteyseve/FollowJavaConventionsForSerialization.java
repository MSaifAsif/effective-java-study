package com.part.seventeen.item.ninteyseve;

import java.io.Serializable;

/**
 * Item 97: Follow Java conventions for serialization.
 *
 * Implementing Serializable requires careful handling to ensure object consistency
 * and backward compatibility.
 */
public class FollowJavaConventionsForSerialization implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String data;

    public FollowJavaConventionsForSerialization(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "FollowJavaConventionsForSerialization{data='" + data + "'}";
    }

    public static void main(String[] args) {
        System.out.println("Follow Java Conventions for Serialization\n");

        FollowJavaConventionsForSerialization obj = new FollowJavaConventionsForSerialization("Example Data");
        System.out.println("Serialized Object: " + obj);
    }
}
