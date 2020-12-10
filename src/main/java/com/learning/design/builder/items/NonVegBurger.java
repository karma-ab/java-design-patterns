package com.learning.design.builder.items;

public class NonVegBurger extends Burger{
    @Override
    public String name() {
        return "Non Veg Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
