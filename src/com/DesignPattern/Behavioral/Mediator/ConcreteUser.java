package com.DesignPattern.Behavioral.Mediator;

public class ConcreteUser extends User {

    public ConcreteUser(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Received Message = " + message);
    }
}
