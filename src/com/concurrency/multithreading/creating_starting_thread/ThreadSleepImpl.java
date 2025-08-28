package com.concurrency.multithreading.creating_starting_thread;

public class ThreadSleepImpl {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("THREAD START");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //code
            }
            System.out.println("THREAD FINISHED");
        };
        Thread t = new Thread(runnable);
        t.start();
    }

}
