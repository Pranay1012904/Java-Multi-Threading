package com.concurrency.multithreading.creating_starting_thread;

public class RunnableImpl2 {

    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("STATEMENT 1");
                System.out.println("STATEMENT 1");
            }
        };

        Thread t=new Thread(runnable);
        t.start();
    }


}
