package com.DesignPattern.Behavioral.State;

public class NoCoinState implements VendingMachineState{

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. You can now press the button.");
    }

    @Override
    public void pressButton() {
        System.out.println("You need to insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted. Cannot dispense.");
    }
}
