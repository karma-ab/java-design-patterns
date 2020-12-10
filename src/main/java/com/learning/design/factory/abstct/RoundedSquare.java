package com.learning.design.factory.abstct;

import com.learning.design.factory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Square draw, implemented Shape");
    }
}
