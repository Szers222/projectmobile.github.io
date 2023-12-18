package com.example.myprojectltdt.dataModels;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
@Entity
public abstract class AbstractQuestion {
    @PrimaryKey
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    protected ArrayList<Integer> userAnswers;
    protected ArrayList<Integer> questionCorrects;
    private String questionDescription;

    public abstract int getResult();

    public ArrayList<Integer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(Integer... userAnswers) {
        for (Integer userAnswer : userAnswers) {
            this.userAnswers.add(userAnswer);
        }
    }

    public ArrayList<Integer> getQuestionCorrects() {
        return questionCorrects;
    }

    public void setQuestionCorrects(Integer... questionCorrects) {
        for (Integer questionCorrect : questionCorrects) {
            this.questionCorrects.add(questionCorrect);
        }
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    @Override
    public String toString() {
        return "AbstractQuestion{" +
                "userAnswers=" + userAnswers +
                ", questionCorrects=" + questionCorrects +
                ", questionDescription='" + questionDescription + '\'' +
                '}';
    }
}
