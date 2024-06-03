package com.DesignPattern.Behavioral.Memento;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
