package com.DesignPattern.Creational.abstractFactory;

public class AndroidMobileFactory extends AbstractFactory {
    @Override
    public Imobile getMobile(String mobileModel) {
        if (mobileModel.equalsIgnoreCase("Oneplus")) {
            return new OnePlus();
        } else if (mobileModel.equalsIgnoreCase("Sony")) {
            return new Sony();
        } else if (mobileModel.equalsIgnoreCase("Lava")) {
            return new Lava();
        }
        return null;
    }
}
