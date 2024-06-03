package com.DesignPattern.Behavioral.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
