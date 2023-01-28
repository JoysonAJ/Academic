package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class dataBaseManger {
    private dataBaseHelper dataBaseHelper;
    private Context context;
    private SQLiteDatabase database;

    public dataBaseManger(Context ctx) {
        context = ctx;
    }

    public dataBaseManger open() throws SQLException {
        dataBaseHelper = new dataBaseHelper(context);
        database = dataBaseHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dataBaseHelper.close();

    }

    public void insert(String username, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(dataBaseHelper.USER_NAME, username);
        contentValues.put(dataBaseHelper.USER_PASSWORD, password);
        database.insert(dataBaseHelper.TABLE_NAME, null, contentValues);
    }

    public long Update(long _id, String Username, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(dataBaseHelper.USER_NAME, Username);
        contentValues.put(dataBaseHelper.USER_PASSWORD, password);
        int result = database.update(dataBaseHelper.TABLE_NAME, contentValues, dataBaseHelper.USER_ID + "=" + _id,null);
        return  result;
    }

    public Cursor fetch(){
        String colums[] = new String[]{dataBaseHelper.USER_NAME,dataBaseHelper.USER_PASSWORD};
        Cursor cursor = database.query(dataBaseHelper.TABLE_NAME,colums,null,null,null,null,null);
        if (cursor != null){
            cursor.moveToFirst();
    }
    return cursor;
}

public void Delete(long _id){
        database.delete(dataBaseHelper.TABLE_NAME,dataBaseHelper.USER_ID +" = " +_id,null);
    }
}
