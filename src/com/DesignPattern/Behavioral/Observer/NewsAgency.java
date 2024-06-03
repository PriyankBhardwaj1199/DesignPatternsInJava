package com.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private List<Observer> observers;
    private String news;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
