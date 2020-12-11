package com.learning.design.chainofresponsibility;

public class ConsolerLogger extends AbstractLogger{

    public ConsolerLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Messgae ::: "+message);
    }
}
