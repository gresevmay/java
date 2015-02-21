package me.eugasl.tasks.thinkingInJava.chapters._11._4;

public class Generator {

    private String[] heroes = {"Pimpa", "Pumpa"};
    private static int i=0;

    public String next() {
        return heroes[i++];
    }

    public int size() {
        return heroes.length;
    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        for(int i=0; i<generator.size(); i++) {

        }
    }
}
