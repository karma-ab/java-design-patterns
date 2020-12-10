package com.learning.design.builder;

import com.learning.design.builder.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        AtomicReference<Float> cost = new AtomicReference<>(0.0f);
        itemList.forEach(item -> cost.set(cost.get() + item.price()));
        return cost.get();
    }

    public void showItems(){
        itemList.forEach(item -> {
            System.out.println("Item Name : "+item.name());
            System.out.println("Item Price : "+item.price());
            System.out.println("Item packing : "+item.packing().pack());
        });
    }

}
