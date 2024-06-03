package com.DesignPattern.Behavioral.State;

public class HasCoinState implements VendingMachineState{

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed. Dispensing item.");
    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed. Please take your item.");
    }
}
