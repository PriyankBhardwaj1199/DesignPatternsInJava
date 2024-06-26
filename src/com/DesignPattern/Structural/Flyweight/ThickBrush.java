package com.DesignPattern.Structural.Flyweight;

public class ThickBrush implements Brush {

    /*
      intrinsic state - shareable
     */
    final BrushSize brushSize = BrushSize.THICK;

    /*
      extrinsic state - supplied by the client
     */
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing '" + content + "' in thick color : " + color);
    }
}
