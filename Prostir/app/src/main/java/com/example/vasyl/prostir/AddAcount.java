package com.example.vasyl.prostir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddAcount extends AppCompatActivity {
    Button buttonQR;
    Button buttonEcm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_acount);
        buttonQR = findViewById(R.id.buttonQR);
        buttonEcm = findViewById(R.id.buttonEcm);
        buttonEcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoEcm();
            }
        });
        buttonQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoQrCcaner();
            }
        });
    }
    void gotoEcm(){
        Intent i = new Intent(this, EnterCodeManually.class);
        startActivity(i);
    }
    void gotoQrCcaner(){
        Intent i = new Intent(this, QrCodeScaner.class);
        startActivity(i);
    }
}
