package com.example.smarthometec_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //log in button
//        Button button1 = (Button) findViewById(R.id.button);
//        button1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                goToUserInfo();
//            }
//        });

        //Botton 2 is sign up
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToSignUp();
            }
        });
    }

    private void goToUserInfo() {

        Intent intent = new Intent(this, UserInformation.class);
        startActivity(intent);

    }

    private void goToSignUp() {

        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);

    }

    //validation to login
    public void login(View view) {

        EditText username = (EditText)findViewById(R.id.username_text);
        EditText password = (EditText)findViewById(R.id.password_text);

        if (username.getText().toString().equals("user") && password.getText().toString().equals("123")) {
            goToUserInfo();
        }
        else{
            goToSignUp();
        }

    }
}