package com.learning.design.builder;

import com.learning.design.builder.items.Coke;
import com.learning.design.builder.items.NonVegBurger;
import com.learning.design.builder.items.Pepsi;
import com.learning.design.builder.items.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new NonVegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
