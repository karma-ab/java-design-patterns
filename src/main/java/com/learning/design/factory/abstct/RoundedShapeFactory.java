package com.learning.design.factory.abstct;

import com.learning.design.factory.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        switch (shape){
            case "ROUNDED_RECTANGLE":
                return new RoundedRectangle();
            case "ROUNDED_SQUARE":
                return new RoundedSquare();
            default:
                return null;
        }
    }
}
