package com.concurrency.multithreading.creating_starting_thread;

public class RunnableImpl {

    public static class example_1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new example_1());
        t.start();
    }
}
