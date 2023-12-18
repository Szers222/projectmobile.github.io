package com.example.myprojectltdt.fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.myprojectltdt.R;
import com.example.myprojectltdt.dataModels.AbstractQuestion;
import com.example.myprojectltdt.dataModels.OneChoiceQuestion;

import java.util.ArrayList;

public class OneChoiceFragment extends AbstractFragment {
    private OneChoiceQuestion question;
    private ArrayList<RadioButton> raBtns;
    //Xây dựng Fragment
    @Nullable

    @Override
    //inflater dan cau lenh
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        raBtns = new ArrayList<>();
        View fragmentAnswer = null;
        View fragmentAnswerPic = inflater.inflate(R.layout.picture_fragment_layout,container,false);

        if(question.getQuestionAnswersChoices().size() == 2 &&  ){
            fragmentAnswer = inflater.inflate(R.layout.twoanswer_fragment_layout,container,false); //Hàm gắn fragment gồm 2 tham số
            TextView txtView =fragmentAnswer.findViewById(R.id.);
            RadioButton rdA = fragmentAnswer.findViewById(R.id.radioButton2);
            RadioButton rdB = fragmentAnswer.findViewById(R.id.radioButton3);
            RadioButton rdC = fragmentAnswer.findViewById(R.id.radioButton1);
            RadioButton rdD = fragmentAnswer.findViewById(R.id.radioButton4);
            raBtns.add(rdA);
            raBtns.add(rdB);
            raBtns.add(rdC);
            raBtns.add(rdD);
        }
        fragment = inflater.inflate(R.layout.one_choice_fragment,container,false); //Hàm gắn fragment gồm 2 tham số
        TextView txtV =fragment.findViewById(R.id.txtView2);
        RadioButton rdA = fragment.findViewById(R.id.radioButton2);
        RadioButton rdB = fragment.findViewById(R.id.radioButton3);
        RadioButton rdC = fragment.findViewById(R.id.radioButton1);
        RadioButton rdD = fragment.findViewById(R.id.radioButton4);
        raBtns.add(rdA);
        raBtns.add(rdB);
        raBtns.add(rdC);
        raBtns.add(rdD);

        //Fill the question data into layout
        //MutilQuestionMultiChoices question = (MutilQuestionMultiChoices) Questions.questions.get(0);
        MyRadioButtonGroup list = new MyRadioButtonGroup(rdA, rdB, rdC, rdD);
        txtV.setText(question.getQuestionDescr());
        rdA.setText(question.getQuestionChoices().get(0));
        rdB.setText(question.getQuestionChoices().get(1));
        rdC.setText(question.getQuestionChoices().get(2));
        rdD.setText(question.getQuestionChoices().get(3));
        return fragment;
    }

    @Override
    public void setQuestionAnswer(int questionId) {
        Questions.questions.get(questionId).getQuestionAnswers().clear();
        for (int i = 0; i < raBtns.size(); i++) {
            if (raBtns.get(i).isChecked()) {
                Questions.questions.get(questionId).setQuestionAnswers(i);
            }
        }
    }

    @Override
    public void setQuestion(AbstractQuestion question) {
        this.question = (MultiQuestionOneChoice) question;
    }
}
