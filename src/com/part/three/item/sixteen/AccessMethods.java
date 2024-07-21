package com.part.three.item.sixteen;

/**
 * Item 16: In public classes, use accessor methods, not public fields
 */
public class AccessMethods {
    public static void main(String[] args) {
        final PublicUser publicUser = new PublicUser.Builder().withName("ANme").build();
        System.out.println(publicUser.getNameOfUser());
    }
}

class PublicUser {

    private String name;

    private PublicUser(Builder builder) {
        this.name = builder.name;
    }

    public String getNameOfUser() {
        return this.name;
    }

    static class Builder {
        private String name;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public PublicUser build() {
            return new PublicUser(this);
        }
    }


}