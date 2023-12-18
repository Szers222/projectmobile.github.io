package com.example.myprojectltdt.dataModels;

import java.util.ArrayList;

public class MultiChoiceQuestion extends AbstractQuestion{

    protected ArrayList<String> questionAnswersChoices;

    public ArrayList<String> getQuestionAnswersChoices() {
        return questionAnswersChoices;
    }

    public void setQuestionAnswersChoices(String...questionAnswersChoices) {
       for (String item : questionAnswersChoices){
           this.questionAnswersChoices.add(item);
       }
    }

    public MultiChoiceQuestion() {
        this.userAnswers = new ArrayList<>();
        this.questionAnswersChoices = new ArrayList<>();
        this.questionCorrects = new ArrayList<>();
    }

    @Override
    public int getResult() {
        return 0;
    }
}
