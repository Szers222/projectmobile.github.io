package com.example.myprojectltdt.activities;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.myprojectltdt.R;
import com.example.myprojectltdt.dataModels.Question;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference questionsRef = database.getReference("questions");
    }
}