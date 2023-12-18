package com.example.myprojectltdt.databases;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.myprojectltdt.dataModels.AbstractQuestion;

@Dao
public interface QuestionDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public long saveQuestion(AbstractQuestion abQuestion);
    @Query("SELECT * FROM question ");
}
