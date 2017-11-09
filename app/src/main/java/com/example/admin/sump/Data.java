package com.example.admin.sump;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Data extends AppCompatActivity {
Dbops db;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        db=new Dbops(getApplicationContext());
        db.dbopen();
        tv=(TextView)findViewById(R.id.txtdata);
        Cursor cu =db.calclog(Login.ultimateuser);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.append(Login.ultimateuser+ " Sump\n\n\n");

        if(cu.getCount()>0)
        {
            while(cu.moveToNext())
            {
                tv.append("\t"+cu.getString(2));
                tv.append("  "+cu.getString(1)+"\n\n");

            }
        }
        else{
            tv.append("\n\tNo data found...");
        }


    }
}
