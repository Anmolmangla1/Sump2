package com.example.admin.sump;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 7/16/2017.
 */

public class Dbcreator extends SQLiteOpenHelper {
    final String query="create table sumpacc(userid varchar(20) primary key, pwd varchar(20))";
    final String querys="create table sumpdata(userid varchar(20),data varchar(200),time varchar(50))";

    public Dbcreator(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(query);
        sqLiteDatabase.execSQL(querys);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("drop table if exists sumpacc");
        sqLiteDatabase.execSQL(query);
        sqLiteDatabase.execSQL("drop table if exists sumpdata");
        sqLiteDatabase.execSQL(querys);
    }
}
