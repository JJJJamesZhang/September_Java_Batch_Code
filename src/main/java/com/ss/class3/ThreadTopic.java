package com.ss.class3;

//extend Thread class
class DummyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Current thread: "+ Thread.currentThread().getName());
    }
}

//Runnable interface
class DummyRun implements Runnable{
    int i;
    public DummyRun(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Current thread:" + Thread.currentThread().getName());
    }
}

public class ThreadTopic {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i< 10; i++){
            Thread t = new Thread(new DummyRun(i));
            t.start();
            t.join();
            System.out.println("running");
        }

    }
}
