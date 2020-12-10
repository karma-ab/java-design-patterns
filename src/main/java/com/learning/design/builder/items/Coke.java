package com.learning.design.builder.items;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
