package com.concurrency.multithreading.creating_starting_thread;

public class DaemonThreads {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " RUNNING !");
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(runnable, "KILLER");
        t.setDaemon(true);
        t.start();
        Thread.sleep(1000);
    }
}
