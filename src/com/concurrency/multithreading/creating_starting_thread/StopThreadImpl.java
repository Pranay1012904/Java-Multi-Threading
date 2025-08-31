//Stopping a Java Thread requires some preparation of your thread implementation code.
//The Java Thread class contains a stop() method, but it is deprecated. The original stop() method would not provide any
//guarantees about in what state the thread was stopped. That means, that all Java objects the thread had access to during execution
//would be left in an unknown state. If other threads in your application also has access to the same objects, your application could
//fail unexpectedly and unpredictably.
package com.concurrency.multithreading.creating_starting_thread;

public class StopThreadImpl implements Runnable {
    private boolean doStop = false;

    public boolean keepRunning() {
        return !doStop;
    }

    public void doStop() {
         doStop=true;
    }

    @Override
    public void run() {
        while (keepRunning()) {
            System.out.println("THREAD :: " + Thread.currentThread().getName() + " Running");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        StopThreadImpl runnable=new StopThreadImpl();
        Thread t=new Thread(runnable,"KILLER THREAD-1");
        t.start();
        try{
            Thread.sleep(10000L); //Puts main thread to sleep
        }catch(InterruptedException e){
            System.out.println(e.getStackTrace());
        }
        runnable.doStop();
    }
}
