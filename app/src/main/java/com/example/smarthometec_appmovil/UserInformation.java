package com.example.smarthometec_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInformation extends AppCompatActivity {

    //nada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        //Botton 5 is gestion
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToGestion();
            }
        });

        //Botton 6 is log out
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToMainPage();
            }
        });
    }

    private void goToGestion() {

        Intent intent5 = new Intent(this, Gestion_SH.class);
        startActivity(intent5);
    }

    private void goToMainPage() {

        Intent intent6 = new Intent(this, MainActivity.class);
        startActivity(intent6);
    }
}