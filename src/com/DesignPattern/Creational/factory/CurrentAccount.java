package com.DesignPattern.Creational.factory;

public class CurrentAccount implements BankAccount {
    @Override
    public void registerAccount() {
        System.out.println("Registering Current Account");
    }
}
