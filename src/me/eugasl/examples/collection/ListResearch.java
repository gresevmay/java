package me.eugasl.examples.collection;

import me.eugasl.examples.Timer;

import java.util.List;

public class ListResearch {

    private static int loopNumber = 1_000_000;

    private List<String> list;

    private Timer timer;

    ListResearch(List<String> list, Timer timer) {
        this.list = list;
        this.timer = timer;
    }

    public void add(String element) {
        this.list.add(element);
    }

    public void add(int index, String element) {
        this.list.add(index, element);
    }

    public void multiAdd() {
        this.timer.startTimer();

        for (int i = 0; i < ListResearch.loopNumber; i++) {
            this.add("" + i);
        }

        this.timer.finishTimer();
    }

    public void multiAdd(int index) {
        this.timer.startTimer();

        for (int i=0; i < ListResearch.loopNumber; i++) {
            this.add(index, i+"");
        }

        this.timer.finishTimer();
    }

    public void size() {
        this.timer.startTimer();
        this.list.size();
        this.timer.finishTimer();
    }

    public void isEmpty() {
        this.timer.startTimer();
        this.list.isEmpty();
        this.timer.finishTimer();
    }

    public boolean contains(String element) {
        this.timer.startTimer();
        boolean isContain = this.list.contains(element);
        this.timer.finishTimer();
        return isContain;
    }

    public void toArray() {
        this.timer.startTimer();
        this.list.toArray();
        this.timer.finishTimer();
    }

    public void remove(String element) {
        this.timer.startTimer();
        this.list.remove(element);
        this.timer.finishTimer();
    }

    public List<String> getArrayList() {
        return this.list;
    }

    public static void setLoopNumer(int loopNumer) {
        ListResearch.loopNumber = loopNumer;
    }
}
