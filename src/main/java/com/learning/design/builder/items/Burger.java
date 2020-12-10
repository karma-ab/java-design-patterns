package com.learning.design.builder.items;

import com.learning.design.builder.packing.Packing;
import com.learning.design.builder.packing.Wrapper;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
