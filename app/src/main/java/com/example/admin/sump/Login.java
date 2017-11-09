package com.example.admin.sump;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button bt1,bt2,btn;
    ImageView btncross;
    EditText u,p,s,ps,cp;
   public static String ultimateuser;
    Dbops db,db1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt1=(Button)findViewById(R.id.signup);
        u=(EditText)findViewById(R.id.uname);
        p=(EditText)findViewById(R.id.pass);
        db=new Dbops(getApplicationContext());
        db.dbopen();
        bt2=(Button)findViewById(R.id.login);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signnerpopup(Login.this);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=u.getText().toString();
                String pass=p.getText().toString();
                boolean boo=db.regcheck(user,pass);
                if(boo==true){
                    ultimateuser=user;
                    Toast.makeText(getApplicationContext(),"Login Successful!",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Login.this,Calculator.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void signnerpopup(Context context){
        final Dialog dialog =new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        dialog.setContentView(R.layout.signup);
        dialog.setCanceledOnTouchOutside(true);
        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        getWindow().setGravity(Gravity.BOTTOM);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        int width=(int)(displayMetrics.widthPixels);
        int height=(int)(displayMetrics.heightPixels);
        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.width=width;
        height=height/2;
        dialog.getWindow().setLayout(width-80,height+70);
        dialog.setCancelable(false);
        s=(EditText)dialog.findViewById(R.id.username);
        ps=(EditText)dialog.findViewById(R.id.password);
        cp=(EditText)dialog.findViewById(R.id.confirm);
        db1=new Dbops(getApplicationContext());
        db1.dbopen();
        btn=(Button)dialog.findViewById(R.id.signner);
        btncross=(ImageView)dialog.findViewById(R.id.cross);
        btncross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
               String user= s.getText().toString();
               String pass= ps.getText().toString();
               String cpass= cp.getText().toString();
                if(pass.trim().equals(cpass.trim())==false)
                {
                    Toast.makeText(getApplicationContext(),"Passwords doesnt match!",Toast.LENGTH_SHORT).show();
                }

                else {
                    boolean boo = db1.insert(user, pass);
                    if(boo==true)
                    {
                        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                   else
                    {
                        Toast.makeText(getApplicationContext(),"Username already exists",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        dialog.show();

    }
}
