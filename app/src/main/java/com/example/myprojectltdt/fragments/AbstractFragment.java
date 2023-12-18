package com.example.myprojectltdt.fragments;

import androidx.fragment.app.Fragment;

import com.example.myprojectltdt.dataModels.AbstractQuestion;


public abstract  class AbstractFragment extends Fragment {
    // Phương thức lưu câu trả lời người dùng
    public abstract void setQuestionAnswer(int questionId);
    public abstract void setQuestion(AbstractQuestion question);
}
