package com.learning.design.factory.abstct;

import com.learning.design.factory.Rectangle;
import com.learning.design.factory.Shape;
import com.learning.design.factory.Square;

public class NonRoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        switch (shape){
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
