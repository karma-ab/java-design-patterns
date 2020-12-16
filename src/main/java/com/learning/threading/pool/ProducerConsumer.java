package com.learning.threading.pool;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

    private Random random = new Random();

    public void producer() throws InterruptedException {
        while(true){
            int rand = random.nextInt(100);
            queue.put(rand);
        }
    }

    public void consumer() throws InterruptedException {
        while(true){
            Thread.sleep(100);
            int val = queue.take();
            System.out.println("Queue Object taken :: " + val + " , Size of Queue :: "+ queue.size());
        }
    }
}
