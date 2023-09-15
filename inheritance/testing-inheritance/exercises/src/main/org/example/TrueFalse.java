package org.example;

public class TrueFalse extends QuestionParent {

    private boolean answer;

    public TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public TrueFalse makeTestQuestion() {
        return null;
    }
}
