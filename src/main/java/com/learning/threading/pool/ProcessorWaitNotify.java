package com.learning.threading.pool;

import java.util.Scanner;

public class ProcessorWaitNotify {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread running...");
            wait();
            System.out.println("Thread resumed..");
        }
    }

    public void consume() throws InterruptedException{

        Scanner sc = new Scanner(System.in);
        Thread.sleep(1000);

        synchronized (this){
            System.out.println("Consumer thread running..Waiting for return key");
            sc.nextLine();
            System.out.println("Return key pressed....");
            notify();
        }
    }

}
