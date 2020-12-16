package com.learning.threading.pool;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLock {

    private int count;
    private final Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    private void increment(){
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException{

        lock.lock();

        System.out.println("First thread waiting......");

        cond.await();

        System.out.println("First thread woken up.......");


        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException{
        Thread.sleep(1000);
        lock.lock();

        System.out.println("Second thread ... Press return key....");
        new Scanner(System.in).nextLine();
        System.out.println("Second thread ... Got Return key, waking up first thread");
        cond.signal();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void finish(){

        System.out.println("Count is  :: "+count);
    }
}
