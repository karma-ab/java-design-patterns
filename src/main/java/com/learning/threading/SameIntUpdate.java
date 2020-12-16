package com.learning.threading;

public class SameIntUpdate {

    private int count;

    private synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        SameIntUpdate sameIntUpdate = new SameIntUpdate();
        sameIntUpdate.doWork();
    }

    public void doWork() throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is :: "+count);
    }
}
