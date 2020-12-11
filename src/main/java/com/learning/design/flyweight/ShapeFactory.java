package com.learning.design.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {

    private static final Map<String,Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color){
        Circle circle = (Circle) circleMap.get(color);
        if(Objects.isNull(circle)){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : "+color);
        }
        return circle;
    }

}
