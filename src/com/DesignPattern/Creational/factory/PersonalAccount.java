package com.DesignPattern.Creational.factory;

public class PersonalAccount implements BankAccount {

    @Override
    public void registerAccount() {
        System.out.println("Registering personal account");
    }
}
