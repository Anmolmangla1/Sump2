package com.example.admin.sump;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Float.*;

public class Calculator extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnc;
    Button btndot;
    Button btnmult;
    Button btndiv;
    Button btnplus;
    Button btnmins;
    Button btneq;
    Dbops db;
    TextView txt,txtv;
    float fst=0, snd=0,out;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucalc,menu);
       return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int s=item.getItemId();
        if(s==R.id.menucalc)
        {
            Intent i=new Intent(Calculator.this,Data.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    int flag=0;
    char sym;
    String tf="0",ts="0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);



        btn9=(Button) findViewById(R.id.button1);
        btn8=(Button) findViewById(R.id.button2);
        btn7=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn1=(Button) findViewById(R.id.button7);
        btn2=(Button) findViewById(R.id.button8);
        btn3=(Button) findViewById(R.id.button9);
        btn0=(Button) findViewById(R.id.button11);
        btnc=(Button) findViewById(R.id.button10);
        btndot=(Button) findViewById(R.id.button12);
        btnmult=(Button) findViewById(R.id.buttonmu);
        btndiv=(Button) findViewById(R.id.buttond);
        btnplus=(Button) findViewById(R.id.buttonp);
        btnmins=(Button) findViewById(R.id.buttonm);
        btneq=(Button) findViewById(R.id.buttoneq);
        txt=(TextView) findViewById(R.id.textView1);
        txtv=(TextView) findViewById(R.id.textView2);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("1");
                    txt.append("1");
                }
                else
                {
                    ts=ts.concat("1");
                    txt.append("1");

                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }
                    txtv.setText(" = "+out);
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("2");
                    txt.append("2");
                }
                else
                {  ts=ts.concat("2");
                    txt.append("2");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }
                    txtv.setText(" = "+out);
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("3");
                    txt.append("3");

                }
                else
                {  ts=ts.concat("3");
                    txt.append("3");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                {  tf=tf.concat("4");
                    txt.append("4");
                }
                else
                {  ts=ts.concat("4");
                    txt.append("4");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                {  tf=tf.concat("5");
                    txt.append("5");
                }
                else
                {  ts=ts.concat("5");
                    txt.append("5");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("6");
                    txt.append("6");
                }
                else
                {  ts=ts.concat("6");
                    txt.append("6");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("7");
                    txt.append("7");
                }
                else
                {  ts=ts.concat("7");
                    txt.append("7");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("8");
                    txt.append("8");
                }
                else
                {  ts=ts.concat("8");
                    txt.append("8");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                { tf=tf.concat("9");
                    txt.append("9");
                }
                else
                {  ts=ts.concat("9");
                    txt.append("9");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                {  tf=tf.concat("0");
                    txt.append("0");
                }
                else
                { ts=ts.concat("0");
                    txt.append("0");
                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }					 txtv.setText(" = "+out);
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                txt.setText("");
                txtv.setText("");
                tf="0";
                ts="0";
                flag=0;

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(flag==0)
                {  tf=tf.concat(".");
                    txt.append(".");
                }
                else
                {  ts=ts.concat(".");
                    txt.append(".");

                }
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                txt.append(" * ");
                sym='*';
                flag++;
                if(flag>1)
                    tf=Float.toString(out);
                ts="";

            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                txt.append(" + ");
                sym='+';
                flag++;
                if(flag>1)
                    tf=Float.toString(out);
                ts="";

            }
        });

        btnmins.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                txt.append(" - ");
                sym='-';
                flag++;
                if(flag>1)
                    tf=Float.toString(out);
                ts="";

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                sym='/';
                txt.append(" / ");
                flag++;
                if(flag>1)
                    tf=Float.toString(out);
                ts="";

            }
        });


        btneq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if("0".equals(ts)||"0".equals(tf))
                    Toast.makeText(getBaseContext(), "Sump says Oops!",Toast.LENGTH_SHORT).show();
                else
                {

                    switch(sym){
                        case '*': out= parseFloat(tf.trim())* parseFloat(ts.trim());break;
                        case '/': out= parseFloat(tf.trim())/ parseFloat(ts.trim());break;
                        case '+': out= parseFloat(tf.trim())+ parseFloat(ts.trim());break;
                        case '-': out= parseFloat(tf.trim())- parseFloat(ts.trim());break;
                    }
                    db=new Dbops(getApplicationContext());
                    db.dbopen();
                  boolean b= db.calcputter(Login.ultimateuser,txt.getText().toString()+" = "+out);
                    if(b==false)
                    {
                     //   Toast.makeText(getApplicationContext(),"Sump could'nt save data",Toast.LENGTH_SHORT).show();
                    }
                   txtv.setText("");
                    txt.setText(" = "+out);

                }
            }
        });

    }
}
