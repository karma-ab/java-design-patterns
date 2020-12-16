package com.learning.threading.pool;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    Account account1 = new Account();
    Account account2 = new Account();
    private Random random = new Random();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void acquireLocks(Lock firstLock, Lock secondLock){
        while (true){
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try{
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            }finally {
                if(gotFirstLock && gotSecondLock){
                    return;
                }
                if(gotFirstLock){
                    firstLock.unlock();
                }
                if(gotSecondLock){
                    secondLock.unlock();
                }
            }

        }
    }


    public void firstThread() throws InterruptedException{
        for (int i = 0; i < 10000; i++) {
            acquireLocks(lock1,lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException{
        for (int i = 0; i < 10000; i++) {
            acquireLocks(lock2,lock1);

            //Deadlock scenario
           /* lock2.lock();
            lock1.lock();*/

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished(){
        System.out.println("Account 1 :: " + account1.getBalance());
        System.out.println("Account 2 :: " + account2.getBalance());
        System.out.println("Total :: "+ (account2.getBalance()+account1.getBalance()));
    }
}
