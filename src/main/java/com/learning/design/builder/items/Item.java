package com.learning.design.builder.items;

import com.learning.design.builder.packing.Packing;

public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
