package me.eugasl.spring;

public class Knight {

    private QuestInterface quest;

    Knight(QuestInterface quest) {
        this.quest = quest;

    }

    public QuestInterface getQuest() {
        return quest;

    }

    public void setQuest(QuestInterface quest) {
        this.quest = quest;
    }
}
