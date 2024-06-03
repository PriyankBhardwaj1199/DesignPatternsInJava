package com.DesignPattern.Behavioral.State;

public class VendingMachine {

    private VendingMachineState state;

    public VendingMachine() {
        state = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
        if (state instanceof NoCoinState) {
            setState(new HasCoinState());
        }
    }

    public void pressButton() {
        state.pressButton();
        if (state instanceof HasCoinState) {
            setState(new NoCoinState());
            state.dispense();
        }
    }

    public void dispense() {
        state.dispense();
    }
}
