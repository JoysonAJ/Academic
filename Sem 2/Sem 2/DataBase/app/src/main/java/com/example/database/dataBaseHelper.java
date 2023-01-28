package com.example.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dataBaseHelper extends SQLiteOpenHelper {

    static final String DATABASE_NAME = "MYDEMO.DB";
    static final int VERSION = 1;

    static final String TABLE_NAME = "USER";
    static final String USER_NAME = "user_name";
    static final String USER_ID = "_ID";
    static final String USER_PASSWORD = "password";

    private static final String CREATE_DB_QUERY = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +"("
            +USER_ID +"INTEGER PRIMARY KEY AUTOINCREMENT ,"
            +USER_NAME+" TEXT NOT NULL ,"
            +USER_PASSWORD+ "TEXT NOT NULL)";



    public dataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       try{
           sqLiteDatabase.execSQL(CREATE_DB_QUERY);
       }catch (SQLException e){
           e.printStackTrace();
       }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int ii) {
        try{
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
