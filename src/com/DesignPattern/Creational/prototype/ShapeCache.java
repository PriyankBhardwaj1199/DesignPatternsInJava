package com.DesignPattern.Creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map< String, Shape > shapeMap = new HashMap< String, Shape >();

    /**
     * Return cloned object of Shape class implementing classes.
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape toBeClonedShape = shapeMap.get(shapeId);
        return (Shape) toBeClonedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
