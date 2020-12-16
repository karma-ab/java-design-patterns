package com.learning.threading;

public class Runner extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
