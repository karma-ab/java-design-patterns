package com.learning.threading.pool;

import java.util.concurrent.CountDownLatch;

public class EngineWithLatch implements Runnable{


    private CountDownLatch latch;

    public EngineWithLatch(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {

        System.out.println("Started...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }
}
