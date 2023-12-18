package com.example.myprojectltdt.databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myprojectltdt.dataModels.AbstractQuestion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {AbstractQuestion.class}, version = MyDatabase.DB_VERSION)
public abstract class MyDatabase extends RoomDatabase {
    public final static String DB_NAME = "myproject_sqlite";
    public final static int DB_VERSION = 1;
    // dat ten
    private  static volatile MyDatabase database;
    private  static final int THREAD_NUMBER = 10;
    public  static  final ExecutorService dbReadWriteExecutor = Executors.newFixedThreadPool(THREAD_NUMBER);
    public abstract QuestionDAO getQuestionDAO();
    //Dinh nghia ham khoi tao database
    public static MyDatabase getDatabase(Context context){
        //Dinh nghia ham khoi tao database
        if(database == null){
            synchronized (MyDatabase.class){
                database = Room.databaseBuilder(context,MyDatabase.class,DB_NAME).build();
            }
        }
        return  database;
    }
}
