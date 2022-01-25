package com.company;

public class MultithreadConcurrencyTaskIV {
    public static void main(String[] args) {

        Runnable run = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running...");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println(threadName + " finished.");

        };

        Thread threadThree = new Thread(run , "The Thread");
        threadThree.start();

        threadThree.setPriority(1);
        int threadPriority = threadThree.getPriority();
        System.out.println(threadPriority);
    }
}
