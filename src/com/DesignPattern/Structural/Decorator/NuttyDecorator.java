package com.DesignPattern.Structural.Decorator;

public class NuttyDecorator extends IcecreamDecorator{

    public NuttyDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }
}
