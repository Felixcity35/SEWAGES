package com.example.felixcity.sewages;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static String Db_name = "saveImage.db";
    public static String Table_name = "imageTable";
    public static int Db_version = 1;
    public static String column_1 = "ID";
    public static String  column_2 = "imagePath";


    public DBHelper(Context context) {
        super(context, Db_name, null, Db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( "CREATE TABLE "+ Table_name + "( ID INTEGER PRIMARY KEY AUTOINCREMENT , imagePath Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_name);
        onCreate(db);
    }
}
