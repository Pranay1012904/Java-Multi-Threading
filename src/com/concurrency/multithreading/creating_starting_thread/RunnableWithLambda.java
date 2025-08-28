package com.concurrency.multithreading.creating_starting_thread;

public class RunnableWithLambda {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Thread With Labmda");
        };
        Thread t = new Thread(runnable);
        t.start();
        thread_Two();
    }

    public static void thread_Two() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " Running");
            }
        };
        Thread t = new Thread(runnable, "My Thread");
        t.start();
        thread_Four();
    }

    public static void thread_Four() {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name+" Running");
        };

        Thread t=new Thread(runnable);//if not specified a default name is given
        t.start();
    }
}
