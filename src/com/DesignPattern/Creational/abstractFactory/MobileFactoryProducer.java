package com.DesignPattern.Creational.abstractFactory;

public abstract class MobileFactoryProducer extends AbstractFactory {

    public static AbstractFactory getFactory(boolean isApple){
        if (isApple) {
            return new AppleMobileFactory();
        } else {
            return new AndroidMobileFactory();
        }
    }
}
