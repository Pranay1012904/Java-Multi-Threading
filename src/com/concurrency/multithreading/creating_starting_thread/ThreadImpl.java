package com.concurrency.multithreading.creating_starting_thread;

public class ThreadImpl extends Thread {

    @Override
    public void run(){
        System.out.println("THREAD :: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t=new Thread(new ThreadImpl(),"MyThread");
        t.start();

    }

}
