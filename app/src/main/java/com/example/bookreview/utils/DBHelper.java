package com.example.bookreview.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    // id, book_id, book_name, author, rate, thoughts, datetime
    private Context context;
    protected static final String DATABASE_NAME = "BookReviews.db";
    private static final String TABLE_NAME = "Reviews";
    protected static final String[] COLUMNS = {"ID", "BOOK_ID", "BOOK_NAME", "AUTHOR", "RATE", "THOUGHTS", "DATETIME"};

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
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

    public boolean insertData(String book_id,
                              String book_name,
                              String author,
                              String rate,
                              String thoughts,
                              String datetime){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMNS[1], book_id);
        cv.put(COLUMNS[2], book_name);
        cv.put(COLUMNS[4], author);
        cv.put(COLUMNS[5], rate);
        cv.put(COLUMNS[6], thoughts);
        cv.put(COLUMNS[7], datetime);

        long result = db.insert(TABLE_NAME, null, cv);
        return (result != -1);
    }

    public boolean deleteData(String book_id, String datetime){
        SQLiteDatabase db = this.getWritableDatabase();
        int result = db.delete(TABLE_NAME, "? = '?'", new String[]{COLUMNS[7], datetime});
        return (result != 0);
    }

    public Cursor fetchAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }

}
