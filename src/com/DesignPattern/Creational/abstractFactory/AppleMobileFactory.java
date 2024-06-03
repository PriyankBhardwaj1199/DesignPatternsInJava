package com.DesignPattern.Creational.abstractFactory;

public class AppleMobileFactory extends AbstractFactory {
    @Override
    public Imobile getMobile(String mobileModel) {
        if (mobileModel.equalsIgnoreCase("iphone")) {
            return new Iphone();
        }
        return null;
    }
}
