package org.executorservicecallablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

class SquareTask implements Callable<Integer> {
    private final int number;

    public SquareTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        return calculateSquare(number);
    }

    private int calculateSquare(int n) {
        return n * n;
    }
}

public class CallableFuture {
    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 4, 6, 8, 10);


        ExecutorService executorService = Executors.newFixedThreadPool(nums.size());


        List<Future<Integer>> futures = new ArrayList<>();


        for (int number : nums) {
            Callable<Integer> task = new SquareTask(number);
            Future<Integer> future = executorService.submit(task);
            futures.add(future);
        }


        executorService.shutdown();


        for (Future<Integer> future : futures) {
            try {
                Integer result = future.get();
                System.out.println("Square result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
