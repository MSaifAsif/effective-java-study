package com.part.five.item.fourtyone;

/**
 * Item 41: Use marker interfaces to define types.
 *
 * Marker interfaces provide type information at compile-time and are preferred over annotations
 * when the primary purpose is type definition.
 */
public class UseMarkerInterfacesToDefineTypes {

    // Marker interface
    public interface Serializable {
    }

    // Class implementing the marker interface
    public static class Data implements Serializable {
        private final String name;

        public Data(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Marker Interfaces to Define Types\n");

        Data data = new Data("Example");
        if (data instanceof Serializable) {
            System.out.println(data.getName() + " is serializable.");
        } else {
            System.out.println(data.getName() + " is not serializable.");
        }
    }
}
