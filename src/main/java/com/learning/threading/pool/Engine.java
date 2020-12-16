package com.learning.threading.pool;

public class Engine implements Runnable{

    private int id;

    public Engine(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting Engine :: "+id + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed Engine :: "+id);
    }
}
