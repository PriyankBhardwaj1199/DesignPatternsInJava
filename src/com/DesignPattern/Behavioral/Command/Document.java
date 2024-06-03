package com.DesignPattern.Behavioral.Command;

public class Document {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
    }

    public void eraseLast(String text) {
        int start = content.length() - text.length();
        content.delete(start, content.length());
    }

    public String read() {
        return content.toString();
    }
}
