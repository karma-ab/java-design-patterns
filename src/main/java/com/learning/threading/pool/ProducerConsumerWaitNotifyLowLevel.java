package com.learning.threading.pool;

import java.util.LinkedList;
import java.util.Random;

public class ProducerConsumerWaitNotifyLowLevel {


    private LinkedList<Integer> integerList = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while(true){
            synchronized(lock){
                while (integerList.size()==LIMIT){
                    lock.wait();
                }
                integerList.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException{

        Random random = new Random();

        while(true){
            synchronized (lock){
                if(integerList.size()==0){
                    lock.wait();
                }
                int value = integerList.removeFirst();
                System.out.println("Value after popup :: "+ value + " , Size :: "+integerList.size());
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000));
        }
    }

}
