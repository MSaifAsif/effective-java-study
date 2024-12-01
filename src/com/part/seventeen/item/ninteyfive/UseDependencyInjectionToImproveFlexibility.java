package com.part.seventeen.item.ninteyfive;

import java.util.Objects;

/**
 * Item 95: Use dependency injection to improve flexibility.
 *
 * Dependency injection decouples classes from their dependencies, making the code easier to test and maintain.
 */
public class UseDependencyInjectionToImproveFlexibility {

    // Bad Example: Hard-coded dependency
    static class BadService {
        public void serve() {
            System.out.println("Bad Example: Service is serving.");
        }
    }

    static class BadClient {
        private final BadService service = new BadService(); // Hard-coded dependency

        public void execute() {
            service.serve();
        }
    }

    // Good Example: Using dependency injection
    interface Service {
        void serve();
    }

    static class GoodService implements Service {
        @Override
        public void serve() {
            System.out.println("Good Example: Service is serving.");
        }
    }

    static class GoodClient {
        private final Service service;

        public GoodClient(Service service) {
            this.service = Objects.requireNonNull(service, "Service must not be null");
        }

        public void execute() {
            service.serve();
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Dependency Injection to Improve Flexibility\n");

        // Bad Example
        BadClient badClient = new BadClient();
        badClient.execute();

        // Good Example
        GoodClient goodClient = new GoodClient(new GoodService());
        goodClient.execute();
    }
}
