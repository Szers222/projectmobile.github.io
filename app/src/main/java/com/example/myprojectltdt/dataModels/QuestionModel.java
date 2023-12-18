package com.example.myprojectltdt.dataModels;

import java.util.ArrayList;

public class QuestionModel {
    private String questionDescription;
    private ArrayList<String> questionAnswers;
    private ArrayList<Integer> questionCorrect;



    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public ArrayList<String> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(ArrayList<String> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    public ArrayList<Integer> getQuestionCorrect() {
        return questionCorrect;
    }

    public void setQuestionCorrect(ArrayList<Integer> questionCorrect) {
        this.questionCorrect = questionCorrect;
    }
    public QuestionModel(String questionDescription, ArrayList<String> questionAnswers, ArrayList<Integer> questionCorrect) {
        this.questionDescription = questionDescription;
        this.questionAnswers = questionAnswers;
        this.questionCorrect = questionCorrect;
    }
    public QuestionModel() {
        this.questionDescription = "";
        this.questionAnswers = new ArrayList<>();
        this.questionCorrect = new ArrayList<>();
    }
}
