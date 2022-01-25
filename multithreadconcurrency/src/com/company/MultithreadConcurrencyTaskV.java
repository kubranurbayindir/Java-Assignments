package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MultithreadConcurrencyTaskV {

    public static void main(String[] args) {

        List<Runnable> listOfRunnable = Arrays.asList(
                () -> System.out.println("Runnable 1"),
                () -> System.out.println("Runnable 2"),
                () -> System.out.println("Runnable 3"),
                () -> System.out.println("Runnable 4"),
                () -> System.out.println("Runnable 5"),
                () -> System.out.println("Runnable 6"),
                () -> System.out.println("Runnable 7"),
                () -> System.out.println("Runnable 8"),
                () -> System.out.println("Runnable 9"));


        ExecutorService executor = Executors.newCachedThreadPool();

        IntStream.range(0, 9).forEach(i -> executor.submit(listOfRunnable.get(i)));

        List<Callable<Integer>> listOfCallable = Arrays.asList(
                () -> {int a=1; System.out.println("Callable 1"); return a;},
                () -> {int a=2; System.out.println("Callable 2"); return a;},
                () -> {int a=3; System.out.println("Callable 3"); return a;},
                () -> {int a=4; System.out.println("Callable 4"); return a;},
                () -> {int a=5; System.out.println("Callable 5"); return a;},
                () -> {int a=6; System.out.println("Callable 6"); return a;});

        try {
            executor.invokeAll(listOfCallable);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        IntStream.range(0, 100).forEach(i -> executor.submit( () -> {
            System.out.println("Task "+ i + " executed by " + Thread.currentThread().getName());
        }));
    }
}

