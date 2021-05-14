package com.example.smarthometec_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelecTipoDisp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_tipo_disp);

        //Botton atras is to go back
        Button buttonBack = (Button) findViewById(R.id.atras);
        buttonBack.setOnClickListener(new View.OnClickListener() {

            //clicking here, user go to gestion smart home page
            @Override
            public void onClick(View v) {
                goToGestion();
            }
        });

        //Botton log out is to log out
        Button buttonlogout = (Button) findViewById(R.id.logout_td);
        buttonlogout.setOnClickListener(new View.OnClickListener() {

            //clicking here, user go to main page
            @Override
            public void onClick(View v) {
                goToMainPage();
            }
        });
    }

    private void goToGestion() {

        Intent intentBack = new Intent(this, Gestion_SH.class);
        startActivity(intentBack);
    }

    private void goToMainPage() {

        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}