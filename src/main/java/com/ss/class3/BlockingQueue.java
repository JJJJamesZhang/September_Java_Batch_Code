package com.ss.class3;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    int limit;
    List<Object> queue = new LinkedList<>();
    public BlockingQueue(int limit){
        this.limit = limit;
    }

    public synchronized void enQueue(Object obj) throws InterruptedException {
        if (queue.size() == limit){
            wait();
        }
        if (queue.size() == 0){
            notifyAll();
        }
        queue.add(obj);
    }

    public synchronized Object deQueue() throws InterruptedException {
        if (queue.size() == 0){
            wait();
        }
        if (queue.size() == limit){
            notifyAll();
        }
        return queue.remove(0);
    }
}
