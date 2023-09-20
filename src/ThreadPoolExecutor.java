package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor implements Runnable{
    private final String poolId;

    private ExecutorService executorService;


    public ThreadPoolExecutor(String poolId) {
        this.poolId = poolId;
    }


    @Override
    public void run() {
        System.out.println("ThreadPoolExecutor poolId: "+ poolId +" is being executed.");
    }
}