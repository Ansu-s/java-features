package org.executorservicecallablefuture;

import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {


        int cores = Runtime.getRuntime().availableProcessors();
        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(cores);

        for (int i = 0; i <= 5; i++) {
            executorService.execute(new Task());
        }
        System.out.println("The thread is - " + Thread.currentThread().getName());
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("The run thread is " + Thread.currentThread().getName());
        }
    }

}