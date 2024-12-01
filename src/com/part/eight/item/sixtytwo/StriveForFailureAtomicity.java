package com.part.eight.item.sixtytwo;

/**
 * Item 62: Strive for failure atomicity.
 *
 * Methods should leave the object in a consistent state even if they fail.
 * This class demonstrates a bad example where failure causes inconsistency and a good example ensuring atomicity.
 */
public class StriveForFailureAtomicity {

    // Bad Example: Non-atomic method
    static class AccountBad {
        private int balance;

        public void withdraw(int amount) {
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount; // May leave inconsistent state
        }

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            balance += amount;
        }
    }

    // Good Example: Atomic method
    static class Account {
        private int balance;

        public synchronized void withdraw(int amount) {
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            // Simulate safe transaction with temporary variable
            int newBalance = balance - amount;
            balance = newBalance;
        }

        public int getBalance() {
            return balance;
        }

        public synchronized void deposit(int amount) {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        System.out.println("Strive for Failure Atomicity\n");

        // Good Example
        Account account = new Account();
        account.deposit(100);

        try {
            account.withdraw(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Good Example: Exception = " + e.getMessage());
        }

        System.out.println("Account balance: " + account.getBalance());
    }
}
