package org.example;

public abstract class QuestionParent {

    private static int idCounter = 1;
    private int id = 0;
    private String question;


    public QuestionParent(String question) {
        this.id = idCounter;
        this.question = question;
    }

    public QuestionParent makeTestQuestion() {
        return null;
    }
}
