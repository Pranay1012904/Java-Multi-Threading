package com.concurrency.multithreading.creating_starting_thread.thread_memory;

public class SameThread {

    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread t1=new Thread(runnable,"T_1");
        Thread t2=new Thread(runnable,"T_2");
        t1.start();
        t2.start();
    }
}
