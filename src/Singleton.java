package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Singleton {

    private static Singleton INSTANCE;

    private static ExecutorService executorService;

    private Singleton() {
        executorService = Executors.newFixedThreadPool(4);
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void submit(ThreadPoolExecutor threadPoolExecutor) {
        executorService.submit(threadPoolExecutor);
    }

}