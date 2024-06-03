package com.DesignPattern.Structural.Decorator;

public class IcecreamDecorator implements IceCream{

    protected IceCream specialIcecream;

    public IcecreamDecorator(IceCream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}
