package com.ss.class3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
//        es.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread running");
//            }
//        });


//        Future future = es.submit(new Callable<String>() {
//
//            @Override
//            public String call() throws Exception {
//                System.out.println("thread running");
//                return "result";
//            }
//        });

//        System.out.println(future.get());
        es.shutdown();

        ExecutorService fixedES = Executors.newFixedThreadPool(2);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("task 1 running");
                Thread.sleep(2000);
                return null;
            }
        });
        callables.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("task 2 running");
                Thread.sleep(2000);
                return null;
            }
        });
        callables.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("task 3 running");
                Thread.sleep(2000);
                return null;
            }
        });
        fixedES.invokeAll(callables);

        fixedES.shutdown();

        //Executors.newCachedThreadPool();
        //Executors.newScheduledThreadPool();
    }

}
