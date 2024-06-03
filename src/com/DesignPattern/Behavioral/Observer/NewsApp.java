package com.DesignPattern.Behavioral.Observer;

public class NewsApp implements Observer{

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("Mobile App - Breaking News: " + news);
    }
}
