package com.learning.design.builder.items;

import com.learning.design.builder.packing.Bottle;
import com.learning.design.builder.packing.Packing;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
