package com.example.bookreview.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    // id, book_id, book_name, author text, rate, thoughts, datetime
    protected static final String DATABASE_NAME = "BookReviews.db";
    private static final String TABLE_NAME = "Reviews";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME +
                        "(ID INTEGER PRIMARY KEY AUTOINCREMENT, BOOK_ID TEXT, BOOK_NAME TEXT, AUTHOR TEXT, RATE TEXT, THOUGHTS TEXT, DATETIME TEXT)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

}
