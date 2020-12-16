package com.learning.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiLockExample {

    private Random random = new Random();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private List<Integer> integer1 = new ArrayList<>();
    private List<Integer> integer2 = new ArrayList<>();

    private void stageOne(){

        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            integer1.add(random.nextInt(100));
        }

    }

    private void stageTwo(){

        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            integer2.add(random.nextInt(100));
        }
    }

    private void process(){

        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() {

        Thread t1 = new Thread(this::process);
        Thread t2 = new Thread(this::process);
        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken : " + (end-start) + "\n List1 : "+integer1.size() + " List2 : "+integer2.size());
    }
}
