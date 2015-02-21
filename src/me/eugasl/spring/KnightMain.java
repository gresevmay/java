package me.eugasl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/knight.xml");

        Knight knight = (Knight)context.getBean("knight");
        QuestInterface quest = knight.getQuest();
        quest.start();
    }

}
