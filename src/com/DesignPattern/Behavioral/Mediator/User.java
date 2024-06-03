package com.DesignPattern.Behavioral.Mediator;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
