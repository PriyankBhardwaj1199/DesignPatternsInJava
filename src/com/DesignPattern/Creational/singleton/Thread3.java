package com.DesignPattern.Creational.singleton;

public class Thread3 implements Runnable{

    @Override
    public void run() {
        SingletonMultiThreaded singletonMultiThreaded = SingletonMultiThreaded.getInstance();
        System.out.print(singletonMultiThreaded.hashCode() + " ");
    }
}
