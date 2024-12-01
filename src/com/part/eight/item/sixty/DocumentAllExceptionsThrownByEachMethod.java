package com.part.eight.item.sixty;

/**
 * Item 60: Document all exceptions thrown by each method.
 *
 * Clearly document exceptions thrown by a method using @throws in the Javadoc,
 * so users of the method can handle them appropriately.
 */
public class DocumentAllExceptionsThrownByEachMethod {

    /**
     * Divides two integers.
     *
     * @param numerator the numerator
     * @param denominator the denominator
     * @return the result of division
     * @throws ArithmeticException if the denominator is zero
     */
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator must not be zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println("Document All Exceptions Thrown by Each Method\n");

        try {
            System.out.println("Result: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
