package com.example.srima.loginintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="com.example.srima.loginintent";
    Button login;
    EditText name;
    EditText mail;
    EditText password;
    TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.button);

        mail = (EditText) findViewById(R.id.mail);
        password = (EditText) findViewById(R.id.pwd);
        mtext = (TextView) findViewById(R.id.onlogin);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sendMessage(v);
            }
        });
    }

       public void sendMessage(View view){
        Intent intent=new Intent(this,onlogin.class);
        name = (EditText) findViewById(R.id.name);
           String message=name.getText().toString();
           intent.putExtra(EXTRA_MESSAGE,message);
           startActivity(intent);
    }
    }






