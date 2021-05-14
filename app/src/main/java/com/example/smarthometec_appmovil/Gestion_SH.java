package com.example.smarthometec_appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gestion_SH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_s_h);

        //Botton 7 is log out
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToMainPage();
            }
        });

        //Botton 8 is next
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToSelecTipoDisp();
            }
        });
    }

    private void goToMainPage() {

        Intent intent7 = new Intent(this, MainActivity.class);
        startActivity(intent7);
    }

    private void goToSelecTipoDisp() {

        Intent intent8 = new Intent(this, SelecTipoDisp.class);
        startActivity(intent8);
    }
}