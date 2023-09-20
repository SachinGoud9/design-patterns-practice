package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton callExecutor = Singleton.getInstance();

        for(int i=0; i < 4; i++) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor("Executing Thread Pool usig Singleton Class for Id: " + i);
            callExecutor.submit(threadPoolExecutor);
        }
    }
}