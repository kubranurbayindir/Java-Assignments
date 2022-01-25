package com.company;

public class MultithreadConcurrencyTaskI {

    public static class MyThread extends Thread{
        public void run() {
           System.out.println("MyThread running");
           System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {//main thread

        MyThread myThread = new MyThread();
        myThread.start();

        //start()
        //sleep(int millisecond)
        //getName
        //setPriority(int newpriority)-->1-10
    }

}
