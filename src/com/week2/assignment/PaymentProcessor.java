package com.week2.assignment;

public class PaymentProcessor {

    public void processPayment(String cardNumber) throws InvalidCardException {
        if (cardNumber.length() < 16) {
            throw new InvalidCardException("Card number must be 16 digits!");
        }
        System.out.println("Payment Processed Successfully!");
    }

    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();

        try {
            p.processPayment("12345");
        } catch (InvalidCardException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
