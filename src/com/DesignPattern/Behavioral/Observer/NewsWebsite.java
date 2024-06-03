package com.DesignPattern.Behavioral.Observer;

public class NewsWebsite implements Observer{

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("News Website - Breaking News: " + news);
    }
}
