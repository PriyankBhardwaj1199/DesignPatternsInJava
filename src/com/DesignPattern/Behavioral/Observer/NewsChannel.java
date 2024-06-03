package com.DesignPattern.Behavioral.Observer;

public class NewsChannel implements Observer{

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("News Channel - Breaking News: " + news);
    }
}
