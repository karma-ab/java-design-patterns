package com.learning.design.factory.abstct;

import com.learning.design.factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Rectangle draw, implemented Shape");
    }
}
