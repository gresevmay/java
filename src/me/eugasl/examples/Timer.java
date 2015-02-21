package me.eugasl.examples;

public class Timer {

    private long start;

    public void startTimer() {
        this.start = System.currentTimeMillis();
    }

    public void finishTimer() {
        long finish = System.currentTimeMillis();
        System.out.print((finish - this.start) + " ms.");
    }

}
