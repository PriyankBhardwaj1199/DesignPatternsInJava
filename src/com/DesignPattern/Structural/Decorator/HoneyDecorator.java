package com.DesignPattern.Structural.Decorator;

public class HoneyDecorator extends IcecreamDecorator{

    public HoneyDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return " + sweet honey";
    }
}
