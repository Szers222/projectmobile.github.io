package com.example.myprojectltdt.dataModels;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Question {
    public static ArrayList<AbstractQuestion> questions;

    public static void initQuestion() {
        questions = new ArrayList<AbstractQuestion>();
        OneChoiceQuestion question1 = new OneChoiceQuestion();
        question1.setQuestionDescription("Câu 1: Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?");
        question1.setQuestionAnswersChoices("1. Phần mặt đường và lề đường.", "2. Phần đường xe chạy.", "3. Phần đường xe cơ giới.");
        question1.setQuestionCorrects(1);

        OneChoiceQuestion question2 = new OneChoiceQuestion();
        question2.setQuestionDescription("Câu 2\n" +
                                         "Làn đường là gì?");
        question2.setQuestionAnswersChoices(
                "1. Là một phần của phần đường xe chay được chia theo chiều dọc của đường, sử dụng cho xe chạy",
                "2. Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.",
                "3. Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có đủ bề rộng cho xe ô tô chạy an toàn.");
        question2.setQuestionCorrects(1);

        OneChoiceQuestion question3 = new OneChoiceQuestion();
        question3.setQuestionDescription("Câu 3/\n" +
                                         "Khái niệm Khố giới hạn đường bộ được hiếu như thế nào là đúng?");
        question3.setQuestionAnswersChoices(
                "1. Là khoảng trong có kích thước giới hạn về chiều cao, chiều rộng của đường, cầu, bến phà, hầm đường bộ để các xe kế cả hàng hóa xếp trên xe đi qua được an toàn.",
                "2. Là khoảng trống có kích thước giới hạn về chiều rộng của đường, cầu, bến phà, hầm trên đường bộ để các xe kể cả hàng hóa xếp trên xe đi qua được an toàn.",
                "3. Là khoảng trống có kích thước giới hạn về chiều cao của cầu, bến phà, hầm trên đường bộ để các xe đi qua được an toàn.");
        question3.setQuestionCorrects(0);
        pushQuestionToFireBase();
    }
    private static void pushQuestionToFireBase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference questionsRef = database.getReference("questions");
        for (AbstractQuestion abstractQuestion : questions) {
            if (abstractQuestion instanceof OneChoiceQuestion) {
                OneChoiceQuestion oneChoiceQuestion = (OneChoiceQuestion) abstractQuestion;

                // Convert đối tượng câu hỏi thành mô hình câu hỏi
                QuestionModel questionModel = new QuestionModel();
                questionModel.setQuestionDescription(oneChoiceQuestion.getQuestionDescription());
                questionModel.setQuestionAnswers(oneChoiceQuestion.getQuestionAnswersChoices());
                questionModel.setQuestionCorrect(oneChoiceQuestion.getQuestionCorrects());

                // Đẩy dữ liệu lên Firebase
                questionsRef.push().setValue(questionModel);
            }
        }
    }
}
