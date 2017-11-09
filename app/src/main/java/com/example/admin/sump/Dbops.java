package com.example.admin.sump;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 7/16/2017.
 */

public class Dbops {

    Dbcreator dbc;
    SQLiteDatabase sql;
    Dbops(Context context) {

        dbc=new Dbcreator(context,"SUMP",null,3);

    }

   void dbopen(){
        sql=dbc.getWritableDatabase();
    }
    void dbclose(){
        sql.close();
    }

    boolean insert(String user,String pwd){

        ContentValues cv=new ContentValues();
        cv.put("userid",user);
        cv.put("pwd",pwd);
        Cursor cu=sql.rawQuery("Select * from sumpacc where userid=?",new String[]{user});
        long b=cu.getCount();
        if(b>0)
        {
            return false;
        }

        long a=sql.insert("sumpacc",null,cv);
        if(a==-1)
            return false;
        else
            return true;

    }

    boolean regcheck(String user,String pwd)
    {
        Cursor cu=sql.rawQuery("Select * from sumpacc where userid=? and pwd=?",new String[]{user,pwd});
        long a=cu.getCount();
        if(a>0)
        {
            return true;
        }
        else
            return false;
    }

    Cursor calclog(String usr)
    {
        Cursor cu=sql.rawQuery("Select * from sumpdata where userid=?",new String[]{usr});
        return  cu;
    }

    boolean calcputter(String usr,String data)
    {
      Cursor cu=sql.rawQuery("Insert into sumpdata values(?,?,datetime('NOW'))",new String[]{usr,data});
            if(cu.moveToFirst())
        return true;
        else
            return false;
    }

}
