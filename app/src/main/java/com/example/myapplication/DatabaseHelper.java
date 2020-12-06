package com.example.myapplication;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper{
    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql1 = "CREATE TABLE USER(STU_NUM text primary key,PASSWORD text not null)";
        Log.i("Database:","createDB="+sql1);
        db.execSQL(sql1);
        String sql2 = "CREATE TABLE SEAT(SEAT_NUM text primary key,STATE text not null)";
        Log.i("Database:","createDB="+sql2);
        db.execSQL(sql2);
        String sql3 = "CREATE TABLE CHOOSE(STU_NUM text primary key,SEAT_NUM text)";
        Log.i("Database:","createDB="+sql3);
        db.execSQL(sql3);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
