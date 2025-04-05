package com.example.a11_shared_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {

    public static final String DATABASE = "STUDENT.DB";
    public static final int VERSION = 5;

    public dbHelper(@Nullable Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table Std (RegisterNumber text  ," +
                "Username text , " +
                " Course text) ";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Std");
        onCreate(db);
    }

    public boolean insert(String regNo,String userName,String course){
        ContentValues contentValues = new ContentValues();
        SQLiteDatabase db = getWritableDatabase();
        contentValues.put("RegisterNumber", regNo);
        contentValues.put("Username", userName);
        contentValues.put("Course", course);

        long r = db.insert("Std", null, contentValues);
        if (r == -1) {
            return false;
        } else {
            return true;
        }
    }

    public long Update(String regNo, String userName, String course) {
        ContentValues contentValues = new ContentValues();
        SQLiteDatabase db = getWritableDatabase();
        contentValues.put("RegisterNumber", regNo);
//        contentValues.put("Username", userName);
        contentValues.put("Course", course);
        int result = db.update("Std", contentValues, "RegisterNumber=" + regNo,null);
        return  result;
    }

    public Cursor fetch(){

        SQLiteDatabase db = getWritableDatabase();
        String colums[] = new String[]{"RegisterNumber","Username","Course"};
        Cursor cursor = db.query("std",colums,null,null,null,null,null);
        if (cursor != null){
            cursor.moveToFirst();
        }
        return cursor;
    }

    public void Delete(long _id){
        SQLiteDatabase db = getWritableDatabase();
        db.delete("std","RegisterNumber = " +_id,null);
    }


}
