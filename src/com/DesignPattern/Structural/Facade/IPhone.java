package com.DesignPattern.Structural.Facade;

public class IPhone implements IMobileShop{

    @Override
    public void getMobileModelNumber() {
        System.out.println("The model is: IPhone 13");
    }

    @Override
    public void getMobilePrice() {
        System.out.println("The price is: 75000 INR ");
    }
}
