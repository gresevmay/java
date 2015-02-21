package me.eugasl.tasks.thinkingInJava.chapters._11._3;

import java.util.ArrayList;
import java.util.Collections;

public class Sequence {

    ArrayList<Object> items = new ArrayList<Object>();


    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        Collections.addAll(sequence.items, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "sequence");

        for(Object item : sequence.items) {
            System.out.println(item);
        }

    }
}
