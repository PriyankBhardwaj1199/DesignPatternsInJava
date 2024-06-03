package com.DesignPattern.Behavioral.Strategy;

public class UPIStrategy implements PaymentStrategy{

    private String upiID;

    public UPIStrategy(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using UPI.");
    }
}
