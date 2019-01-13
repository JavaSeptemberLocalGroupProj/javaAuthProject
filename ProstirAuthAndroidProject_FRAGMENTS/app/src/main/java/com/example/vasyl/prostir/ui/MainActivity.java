package com.example.vasyl.prostir.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.vasyl.prostir.R;

public class MainActivity extends AppCompatActivity {
    EnterCodeManuallyFragment ent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ent = new EnterCodeManuallyFragment();
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction().replace(R.id.mainLayout, new CountryPickerFragment());
        ft.commit();
    }

}
