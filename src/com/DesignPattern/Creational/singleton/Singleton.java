package com.DesignPattern.Creational.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    /* private constructor */
    private Singleton() {}

    /* returns the same object */
    public static Singleton getInstance() {
        return instance;
    }
}
