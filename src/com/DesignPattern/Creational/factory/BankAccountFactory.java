package com.DesignPattern.Creational.factory;

public class BankAccountFactory {

    public BankAccount createAccount(String type) {

        BankAccount bankAccount = null;

        if (type.equals("P")) {
            bankAccount = new PersonalAccount();
        } else if (type.equals("B")) {
            bankAccount = new BussinessAccount();
        } else if (type.equals("C")) {
            bankAccount = new CurrentAccount();
        } else {
            System.out.println("Invalid type");
        }

        return bankAccount;
    }
}
