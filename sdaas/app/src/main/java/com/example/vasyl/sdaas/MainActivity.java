package com.example.vasyl.sdaas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rilixtech.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
    }
}
