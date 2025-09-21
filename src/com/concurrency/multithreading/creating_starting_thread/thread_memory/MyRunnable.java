package com.concurrency.multithreading.creating_starting_thread.thread_memory;

public class MyRunnable implements Runnable {

    private int count = 1;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + count);
            count++;
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("EXCEPTION :: "+ex.getMessage());
            }
        }

    }
}
