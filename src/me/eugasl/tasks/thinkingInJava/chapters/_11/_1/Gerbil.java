package me.eugasl.tasks.thinkingInJava.chapters._11._1;

import java.util.ArrayList;
import java.util.Collections;

public class Gerbil {

    private int gerbilNumber;

    Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    String hop(){
        return "gerbilNumber=" + this.gerbilNumber;
    }

    public static void main(String[] args){
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        Collections.addAll(gerbils, new Gerbil(1), new Gerbil(2), new Gerbil(3), new Gerbil(4), new Gerbil(5));

        for(Gerbil gerbil: gerbils) {
            System.out.println(gerbil.hop());
        }
    }

}
