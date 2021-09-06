package com.example.basicsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText pwdText;
    ImageButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //System.out.println("hello world");

        nameText=(EditText) findViewById(R.id.name);
        pwdText=(EditText) findViewById(R.id.pwd);
        loginBtn=(ImageButton) findViewById(R.id.imageButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(TextUtils.isEmpty(nameText.getText()) || TextUtils.isEmpty(pwdText.getText())){
                    Toast.makeText(MainActivity.this, "Please fill out all fields", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "You are logged in!", Toast.LENGTH_LONG).show();
                    homePage();
                }

            }
        });


    }




    private void homePage() {

        Intent a = new Intent(MainActivity.this, HomePage.class);
        startActivity(a);
    }
}