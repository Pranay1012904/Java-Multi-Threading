package com.concurrency.multithreading.creating_starting_thread_3;

public class ManualThreadStopArrangement {

    private boolean doStop = false;

    public boolean keepRunning() {
        return !doStop;
    }

    public boolean doStop() {
        return doStop = true;
    }

    public static void main(String[] args) {
        ManualThreadStopArrangement stop = new ManualThreadStopArrangement();
        Runnable runnable = () -> {
            while (stop.keepRunning()) {
                System.out.println("Thread :: " + Thread.currentThread().getName() + " Running");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException ex) {
                    System.out.println("EX :: " + ex.getMessage());
                }
            }
        };

        Thread t = new Thread(runnable, "KILLER-1");
        t.start();
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException ex) {
            System.out.println("EX :: " + ex.getMessage());
        }
        System.out.println("REQUESTING STOP");
        stop.doStop();
        System.out.println("THREAD STOPPED");
    }

}
