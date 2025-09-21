package com.concurrency.multithreading.creating_starting_thread.thread_memory;

public class SeperateThreads {

    public static void main(String[] args) {
        Runnable runnable1=new MyRunnable();
        Runnable runnable2=new MyRunnable();
        Thread t1 = new Thread(runnable1,"Thread_1");
        Thread t2 = new Thread(runnable2,"Thread_2");
        t1.setPriority(1);
        t1.start();
        t2.setPriority(2);
        t2.start();
    }
}
