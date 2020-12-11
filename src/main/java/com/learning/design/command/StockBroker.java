package com.learning.design.command;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        orders.forEach(order -> order.execute());
        orders.clear();
    }

}
