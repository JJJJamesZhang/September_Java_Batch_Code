package com.ss.class3;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    int tickets = 10;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (tickets > 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("Current thread:" +Thread.currentThread().getName() + ", Current ticket:" + tickets--);
                sale();
            }
        }
    }

    public void sale(){
        lock.lock();
        if (tickets > 0)
            System.out.println("Current thread:" +Thread.currentThread().getName() + ", Current ticket:" + tickets--);
        lock.unlock();
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"1").start();
        new Thread(ticket,"2").start();
        new Thread(ticket,"3").start();
    }
}
