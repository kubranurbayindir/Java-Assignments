package com.company;

public class MultithreadConcurrencyTaskIII {

    public static void main(String[] args) {

//        Runnable run = () -> System.out.println("I am a runnable program!!" +  " - "
//                + " Thread name : " + Thread.currentThread().getName());
//
        Runnable run = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + i   + " - " + " Thread name : " + Thread.currentThread().getName());
            }
        };

        Thread threadOne = new Thread(run);
        Thread threadTwo = new Thread(run);

        System.out.println("Thread names are following:");
        System.out.println(threadOne.getName());
        System.out.println(threadTwo.getName());

        threadOne.start();
        threadTwo.start();

    }
}
