package me.eugasl.examples;

import me.eugasl.examples.collection.ListResearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Examples {

    public static void main(String[] args) {

        ApplicationContext exampleContext =
                new ClassPathXmlApplicationContext("resources/me/eugasl/examples/examples.xml");

        ListResearch.setLoopNumer(100_000);

        ListResearch arrayListResearch = (ListResearch) exampleContext.getBean("arrayListResearch");
        ListResearch linkedListResearch = (ListResearch) exampleContext.getBean("linkedListResearch");

        System.out.print("ArrayList add(T element): ");
        arrayListResearch.multiAdd();
        System.out.println();

        System.out.print("LinkedList add(T element): ");
        linkedListResearch.multiAdd();
        System.out.println();
        System.out.println();

        System.out.print("ArrayList add(int index, T element): ");
        arrayListResearch.multiAdd(100);
        System.out.println();

        System.out.print("LinkedList add(int index, T element): ");
        linkedListResearch.multiAdd(100);
        System.out.println();
        System.out.println();

        System.out.print("ArrayList size(): ");
        arrayListResearch.size();
        System.out.println();

        System.out.print("LinkedList size(): ");
        linkedListResearch.size();
        System.out.println();
        System.out.println();

        System.out.print("ArrayList isEmpty(): ");
        arrayListResearch.isEmpty();
        System.out.println();

        System.out.print("LinkedList isEmpty(): ");
        linkedListResearch.isEmpty();
        System.out.println();
        System.out.println();

        System.out.print("ArrayList contains(Object o): ");
        System.out.print(arrayListResearch.contains("55000"));
        System.out.println();

        System.out.print("LinkedList contains(Object o): ");
        System.out.print(linkedListResearch.contains("50000"));
        System.out.println();
        System.out.println();

        System.out.print("ArrayList toArray(): ");
        arrayListResearch.toArray();
        System.out.println();

        System.out.print("LinkedList toArray(): ");
        linkedListResearch.toArray();
        System.out.println();
        System.out.println();

        System.out.print("ArrayList remove(String element): ");
        arrayListResearch.remove("55000");
        System.out.println();

        System.out.print("LinkedList remove(String element): ");
        linkedListResearch.remove("55000");
        System.out.println();
        System.out.println();



    }

}
