package com.DesignPattern.Behavioral.Strategy;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;
    private String name;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String cardNumber, String name, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
