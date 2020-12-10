package com.learning.design.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Printing Circle, implemented Shape interface");
    }
}
