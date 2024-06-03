package com.DesignPattern.Creational.factory;

public class BussinessAccount implements BankAccount {

    @Override
    public void registerAccount() {
        System.out.println("Registering bussiness account");
    }
}
