package com.learning.threading.pool;

import java.util.concurrent.Semaphore;

public class ConnectionSemaphore {

    private ConnectionSemaphore(){
    }

    private static ConnectionSemaphore instance = new ConnectionSemaphore();

    public static ConnectionSemaphore getInstance() {
        return instance;
    }

    private int connections = 0;

    private Semaphore sem = new Semaphore(10,true);

    public void connect() throws InterruptedException {
        sem.acquire();
        try{
            doConnect();
        }finally {
            sem.release();
        }
    }

    public void doConnect() throws InterruptedException {
        synchronized (this){
            connections++;
            System.out.println("Current connections :: "+connections);
        }

        Thread.sleep(2000);

        synchronized (this){
            connections--;
        }
    }
}
