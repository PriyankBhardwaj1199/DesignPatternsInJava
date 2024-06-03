package com.DesignPattern.Behavioral.Memento;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> mementos = new Stack<>();

    public void saveMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getMemento() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
