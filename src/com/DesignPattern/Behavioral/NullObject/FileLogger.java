package com.DesignPattern.Behavioral.NullObject;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        // Code to log message to a file
        System.out.println("File Logger: " + message); // Simplified for illustration
    }
}
